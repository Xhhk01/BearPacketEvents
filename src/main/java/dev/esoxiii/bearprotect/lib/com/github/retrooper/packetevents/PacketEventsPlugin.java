package dev.esoxiii.bearprotect.lib.com.github.retrooper.packetevents;

import dev.esoxiii.bearprotect.lib.com.github.retrooper.packetevents.factory.spigot.SpigotPacketEventsBuilder;
import dev.esoxiii.bearprotect.lib.com.github.retrooper.packetevents.util.SpigotConversionUtil;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.PacketEvents;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.event.PacketListenerPriority;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.event.SimplePacketListenerAbstract;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.event.UserConnectEvent;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.event.UserDisconnectEvent;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.event.UserLoginEvent;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.event.simple.PacketConfigReceiveEvent;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.event.simple.PacketConfigSendEvent;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.event.simple.PacketLoginSendEvent;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.event.simple.PacketPlayReceiveEvent;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.event.simple.PacketPlaySendEvent;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.packettype.PacketType;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.world.states.type.StateTypes;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.util.TimeStampMode;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.client.WrapperPlayClientInteractEntity;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerBlockChange;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerSystemChatMessage;

import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class PacketEventsPlugin extends JavaPlugin {

    public void onLoad() {
        PacketEvents.setAPI(SpigotPacketEventsBuilder.build(this));
        PacketEvents.getAPI().load();
    }

    public void onEnable() {
        PacketEvents.getAPI()
                .getSettings()
                .debug(false)
                .checkForUpdates(true)
                .timeStampMode(TimeStampMode.MILLIS)
                .reEncodeByDefault(true);
        PacketEvents.getAPI().init();
        new SimplePacketListenerAbstract(PacketListenerPriority.HIGH) {

            @Override
            public void onPacketLoginSend(PacketLoginSendEvent result) {}

            @Override
            public void onPacketConfigReceive(PacketConfigReceiveEvent result) {}

            @Override
            public void onPacketConfigSend(PacketConfigSendEvent result) {}

            @Override
            public void onPacketPlayReceive(PacketPlayReceiveEvent result) {
                if (result.getPacketType() == PacketType.Play.Client.INTERACT_ENTITY
                        && new WrapperPlayClientInteractEntity(result).getAction()
                                == WrapperPlayClientInteractEntity.InteractAction.ATTACK) {
                    Player player = result.getPlayer();
                    WrapperPlayServerBlockChange wrapperPlayServerBlockChange =
                            new WrapperPlayServerBlockChange(
                                    SpigotConversionUtil.fromBukkitLocation(player.getLocation())
                                            .getPosition()
                                            .toVector3i()
                                            .subtract(0, 1, 0),
                                    StateTypes.COAL_BLOCK.createBlockState().getGlobalId());
                    result.getUser().sendPacket(wrapperPlayServerBlockChange);
                }
            }

            @Override
            public void onPacketPlaySend(PacketPlaySendEvent result) {
                if (result.getPacketType() == PacketType.Play.Server.BLOCK_CHANGE) {
                    WrapperPlayServerBlockChange wrapperPlayServerBlockChange2 =
                            new WrapperPlayServerBlockChange(result);
                    result.<Player>getPlayer()
                            .sendMessage(
                                    "Type: "
                                            + wrapperPlayServerBlockChange2
                                                    .getBlockState()
                                                    .getType()
                                                    .getName());
                } else if (result.getPacketType() == PacketType.Play.Server.SYSTEM_CHAT_MESSAGE) {
                    new WrapperPlayServerSystemChatMessage(result);
                }
            }

            @Override
            public void onUserConnect(UserConnectEvent result) {
                PacketEvents.getAPI()
                        .getLogManager()
                        .debug(
                                "User: (host-name) "
                                        + result.getUser().getAddress().getHostString()
                                        + " connected...");
            }

            @Override
            public void onUserLogin(UserLoginEvent result) {
                PacketEvents.getAPI()
                        .getLogManager()
                        .debug(
                                "You logged in! User name: "
                                        + result.getUser().getProfile().getName());
            }

            @Override
            public void onUserDisconnect(UserDisconnectEvent result) {
                PacketEvents.getAPI()
                        .getLogManager()
                        .debug(
                                "User: (host-name) "
                                        + result.getUser().getAddress().getHostString()
                                        + " disconnected...");
            }
        };
    }

    public void onDisable() {
        PacketEvents.getAPI().terminate();
    }
}
