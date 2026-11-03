package dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.manager;

import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.PacketEvents;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.event.PacketListenerAbstract;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.event.PacketListenerPriority;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.event.PacketReceiveEvent;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.event.PacketSendEvent;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.event.ProtocolPacketEvent;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.manager.server.ServerVersion;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.ConnectionState;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.packettype.PacketType;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.player.ClientVersion;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.player.User;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.player.UserProfile;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.util.LogManager;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.util.mappings.SynchronizedRegistriesHandler;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.configuration.server.WrapperConfigServerConfigurationEnd;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.configuration.server.WrapperConfigServerRegistryData;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.handshaking.client.WrapperHandshakingClientHandshake;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.login.server.WrapperLoginServerLoginSuccess;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerJoinGame;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerRespawn;

import org.jetbrains.annotations.ApiStatus.Internal;

@Internal
public class InternalPacketListener extends PacketListenerAbstract {

    public InternalPacketListener() {
        this(PacketListenerPriority.LOWEST);
    }

    public InternalPacketListener(PacketListenerPriority packetListenerPriority) {
        super(packetListenerPriority);
    }

    protected void handlePlayEnter(ProtocolPacketEvent protocolPacketEvent) {}

    @Override
    public void onPacketSend(PacketSendEvent packetSendEvent) {
        User user = packetSendEvent.getUser();
        if (packetSendEvent.getPacketType() == PacketType.Login.Server.LOGIN_SUCCESS) {
            Object channel = packetSendEvent.getChannel();
            UserProfile userProfile =
                    new WrapperLoginServerLoginSuccess(packetSendEvent).getUserProfile();
            user.getProfile().setUUID(userProfile.getUUID());
            user.getProfile().setName(userProfile.getName());
            user.getProfile().setTextureProperties(userProfile.getTextureProperties());
            synchronized (channel) {
                PacketEvents.getAPI()
                        .getProtocolManager()
                        .setChannel(userProfile.getUUID(), channel);
            }
            if (PacketEvents.getAPI().getLogManager().isDebug()) {
                PacketEvents.getAPI()
                        .getLogManager()
                        .debug(
                                "Mapped player UUID with their channel "
                                        + userProfile.getUUID()
                                        + " "
                                        + channel);
            }
            if (PacketEvents.getAPI().getInjector().isProxy()
                    ? !packetSendEvent
                            .getUser()
                            .getClientVersion()
                            .isNewerThanOrEquals(ClientVersion.V_1_20_2)
                    : !packetSendEvent
                            .getServerVersion()
                            .isNewerThanOrEquals(ServerVersion.V_1_20_2)) {
                user.setEncoderState(ConnectionState.PLAY);
                user.setDecoderState(ConnectionState.PLAY);
                this.handlePlayEnter(packetSendEvent);
            } else {
                user.setEncoderState(ConnectionState.CONFIGURATION);
            }
            if (PreViaSupport.hasPreViaInternalListener()
                    && user.getClientVersion() != null
                    && user.getClientVersion().isOlderThan(ClientVersion.V_1_20_2)) {
                user.setPreViaDecoderState(ConnectionState.PLAY);
            }
        } else if (packetSendEvent.getPacketType()
                == PacketType.Configuration.Server.REGISTRY_DATA) {
            WrapperConfigServerRegistryData wrapperConfigServerRegistryData;
            if ((wrapperConfigServerRegistryData =
                                    new WrapperConfigServerRegistryData(packetSendEvent))
                            .getElements()
                    != null) {
                SynchronizedRegistriesHandler.handleRegistry(
                        user,
                        wrapperConfigServerRegistryData,
                        wrapperConfigServerRegistryData.getRegistryKey(),
                        wrapperConfigServerRegistryData.getElements());
            }
            if (wrapperConfigServerRegistryData.getRegistryData() != null) {
                SynchronizedRegistriesHandler.handleLegacyRegistries(
                        user,
                        wrapperConfigServerRegistryData,
                        wrapperConfigServerRegistryData.getRegistryData());
            }
        } else if (packetSendEvent.getPacketType() == PacketType.Play.Server.JOIN_GAME) {
            WrapperPlayServerJoinGame wrapperPlayServerJoinGame =
                    new WrapperPlayServerJoinGame(packetSendEvent);
            user.setEntityId(wrapperPlayServerJoinGame.getEntityId());
            if (wrapperPlayServerJoinGame.getDimensionCodec() != null) {
                SynchronizedRegistriesHandler.handleLegacyRegistries(
                        user,
                        wrapperPlayServerJoinGame,
                        wrapperPlayServerJoinGame.getDimensionCodec());
                user.finalizeRegistries(wrapperPlayServerJoinGame);
            }
            user.setDimensionType(wrapperPlayServerJoinGame.getDimensionType());
        } else if (packetSendEvent.getPacketType() == PacketType.Play.Server.RESPAWN) {
            WrapperPlayServerRespawn wrapperPlayServerRespawn =
                    new WrapperPlayServerRespawn(packetSendEvent);
            user.setDimensionType(wrapperPlayServerRespawn.getDimensionType());
        } else if (packetSendEvent.getPacketType() == PacketType.Play.Server.CONFIGURATION_START) {
            user.setEncoderState(ConnectionState.CONFIGURATION);
        } else if (packetSendEvent.getPacketType()
                == PacketType.Configuration.Server.CONFIGURATION_END) {
            user.setEncoderState(ConnectionState.PLAY);
            user.finalizeRegistries(new WrapperConfigServerConfigurationEnd(packetSendEvent));
            this.handlePlayEnter(packetSendEvent);
        }
    }

    @Override
    public void onPacketReceive(PacketReceiveEvent packetReceiveEvent) {
        User user = packetReceiveEvent.getUser();
        if (packetReceiveEvent.getPacketType() == PacketType.Handshaking.Client.HANDSHAKE) {
            WrapperHandshakingClientHandshake wrapperHandshakingClientHandshake;
            ClientVersion clientVersion =
                    (wrapperHandshakingClientHandshake =
                                    new WrapperHandshakingClientHandshake(packetReceiveEvent))
                            .getClientVersion();
            ConnectionState nextConnectionState =
                    wrapperHandshakingClientHandshake.getNextConnectionState();
            LogManager logManager;
            if ((logManager = PacketEvents.getAPI().getLogManager()).isDebug()) {
                logManager.debug(
                        "Processed handshake for "
                                + packetReceiveEvent.getAddress()
                                + ": "
                                + nextConnectionState.name()
                                + " / "
                                + wrapperHandshakingClientHandshake
                                        .getClientVersion()
                                        .getReleaseName());
            }
            user.setClientVersion(clientVersion);
            user.setConnectionState(nextConnectionState);
        } else if (packetReceiveEvent.getPacketType()
                == PacketType.Login.Client.LOGIN_SUCCESS_ACK) {
            user.setDecoderState(ConnectionState.CONFIGURATION);
        } else if (packetReceiveEvent.getPacketType() == PacketType.Play.Client.CONFIGURATION_ACK) {
            user.setDecoderState(ConnectionState.CONFIGURATION);
        } else if (packetReceiveEvent.getPacketType()
                == PacketType.Configuration.Client.CONFIGURATION_END_ACK) {
            user.setDecoderState(ConnectionState.PLAY);
        }
    }
}
