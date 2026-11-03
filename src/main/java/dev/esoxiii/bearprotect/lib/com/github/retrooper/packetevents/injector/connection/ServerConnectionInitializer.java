package dev.esoxiii.bearprotect.lib.com.github.retrooper.packetevents.injector.connection;

import io.netty.channel.Channel;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelFutureListener;

import dev.esoxiii.bearprotect.lib.com.github.retrooper.packetevents.injector.SpigotChannelInjector;
import dev.esoxiii.bearprotect.lib.com.github.retrooper.packetevents.injector.handlers.PacketEventsDecoder;
import dev.esoxiii.bearprotect.lib.com.github.retrooper.packetevents.injector.handlers.PacketEventsEncoder;
import dev.esoxiii.bearprotect.lib.com.github.retrooper.packetevents.util.viaversion.ViaVersionUtil;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.PacketEvents;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.event.PacketListenerCommon;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.event.UserConnectEvent;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.manager.PreViaSupport;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.netty.ChannelInjectListener;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.netty.channel.ChannelHelper;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.ConnectionState;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.player.ClientVersion;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.player.User;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.player.UserProfile;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.util.FakeChannelUtil;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.util.PacketEventsImplHelper;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.function.Consumer;

public class ServerConnectionInitializer {

    public static final Consumer<PacketListenerCommon> PRE_VIA_LISTENER_REGISTERED =
            result -> {
                SpigotChannelInjector spigotChannelInjector;
                if (PreViaSupport.isExternalPreViaListener(result)) {
                    PreViaSupport.ensurePreViaInternalListenerRegistered();
                    if (ViaVersionUtil.isAvailable()) {
                        if (!(spigotChannelInjector =
                                        (SpigotChannelInjector) PacketEvents.getAPI().getInjector())
                                .isPreViaRequested()) {
                            spigotChannelInjector.setPreViaRequested(true);
                        }
                        spigotChannelInjector.catchUpPreViaOnExistingChannelsIfNeeded();
                    }
                }
            };

    public static void initChannel(Object result, ConnectionState connectionState) {
        Channel channel;
        if (!FakeChannelUtil.isFakeChannel(channel = (Channel) result)) {
            User user = new User(channel, connectionState, null, new UserProfile(null, null));
            if (connectionState == ConnectionState.PLAY) {
                user.setClientVersion(
                        PacketEvents.getAPI().getServerManager().getVersion().toClientVersion());
                PacketEvents.getAPI()
                        .getLogManager()
                        .warn(
                                "Late injection detected, we missed packets so some functionality may break!");
            }
            synchronized (channel) {
                if (channel.pipeline().get("splitter") == null) {
                    channel.close();
                } else {
                    UserConnectEvent userConnectEvent = new UserConnectEvent(user);
                    PacketEvents.getAPI().getEventManager().callEvent(userConnectEvent);
                    if (userConnectEvent.isCancelled()) {
                        channel.unsafe().closeForcibly();
                    } else {
                        relocateHandlers(channel, user, false);
                        if (((SpigotChannelInjector) PacketEvents.getAPI().getInjector())
                                .isPreViaRequested()) {
                            relocateHandlers(channel, user, true);
                        }
                        ChannelFuture channelFuture = channel.closeFuture();
                        channelFuture.addListener(
                                (ChannelFutureListener)
                                        result2 ->
                                                PacketEventsImplHelper.handleDisconnection(
                                                        user.getChannel(), user.getUUID()));
                        PacketEvents.getAPI().getProtocolManager().setUser(channel, user);
                    }
                }
            }
        }
    }

    public static void destroyHandlers(Object result) {
        Channel channel;
        if ((channel = (Channel) result).pipeline().get(PacketEvents.DECODER_NAME) != null) {
            channel.pipeline().remove(PacketEvents.DECODER_NAME);
        } else {
            PacketEvents.getAPI()
                    .getLogManager()
                    .warn("Could not find decoder handler in channel pipeline!");
        }
        if (channel.pipeline().get(PacketEvents.ENCODER_NAME) != null) {
            channel.pipeline().remove(PacketEvents.ENCODER_NAME);
        } else {
            PacketEvents.getAPI()
                    .getLogManager()
                    .warn("Could not find encoder handler in channel pipeline!");
        }
    }

    public static void relocateHandlers(Channel channel, User user, boolean preVia) {
        try {
            if (PacketEvents.getAPI().getSettings().isDebugEnabled()) {
                PacketEvents.getAPI()
                        .getLogManager()
                        .debug(
                                "Pre relocate, preVia: "
                                        + preVia
                                        + ", "
                                        + ChannelHelper.pipelineHandlerNamesAsString(channel));
            }
            if (user.getClientVersion() != ClientVersion.V_1_13
                    && user.getClientVersion() != ClientVersion.V_1_13_1) {
                String encoderName =
                        preVia ? "pre-" + PacketEvents.ENCODER_NAME : PacketEvents.ENCODER_NAME;
                String decoderName =
                        preVia ? "pre-" + PacketEvents.DECODER_NAME : PacketEvents.DECODER_NAME;
                String decoderAnchor;
                String encoderAnchor;
                if (preVia) {
                    encoderAnchor = "via-encoder";
                    decoderAnchor = "via-decoder";
                } else {
                    decoderAnchor =
                            channel.pipeline().names().contains("inbound_config")
                                    ? "inbound_config"
                                    : "decoder";
                    encoderAnchor =
                            channel.pipeline().names().contains("outbound_config")
                                    ? "outbound_config"
                                    : "encoder";
                }
                PacketEventsDecoder existingDecoder;
                PacketEventsEncoder encoder;
                PacketEventsDecoder decoder;
                if ((existingDecoder = (PacketEventsDecoder) channel.pipeline().get(decoderName))
                        != null) {
                    if (existingDecoder.hasBeenRelocated
                            && handlersAlreadyRelocated(
                                    channel, preVia, decoderName, decoderAnchor, encoderName, encoderAnchor)) {
                        return;
                    }
                    existingDecoder.hasBeenRelocated = true;
                    decoder =
                            new PacketEventsDecoder(
                                    (PacketEventsDecoder) channel.pipeline().remove(decoderName));
                    encoder = new PacketEventsEncoder(channel.pipeline().remove(encoderName));
                } else {
                    encoder = new PacketEventsEncoder(user, preVia);
                    decoder = new PacketEventsDecoder(user, preVia);
                }
                if (PacketEvents.getAPI().getSettings().isDebugEnabled()) {
                    PacketEvents.getAPI()
                            .getLogManager()
                            .debug(
                                    "After remove, preVia: "
                                            + preVia
                                            + ", "
                                            + ChannelHelper.pipelineHandlerNamesAsString(channel));
                }
                if (preVia) {
                    channel.pipeline()
                            .addBefore("via-encoder", encoderName, encoder)
                            .addBefore("via-decoder", decoderName, decoder);
                } else {
                    channel.pipeline()
                            .addBefore(decoderAnchor, decoderName, decoder)
                            .addBefore(encoderAnchor, encoderName, encoder);
                }
                for (ChannelInjectListener listener :
                        PacketEvents.getAPI().getSettings().getChannelInjectListeners()) {
                    listener.onInject(channel, user, preVia);
                }
                if (PacketEvents.getAPI().getSettings().isDebugEnabled()) {
                    PacketEvents.getAPI()
                            .getLogManager()
                            .debug(
                                    "After add, preVia: "
                                            + preVia
                                            + ", "
                                            + ChannelHelper.pipelineHandlerNamesAsString(channel));
                }
            } else {
                channel.close();
            }
        } catch (NoSuchElementException noSuchElementException) {
            String text5 = ChannelHelper.pipelineHandlerNamesAsString(channel);
            throw new IllegalStateException(
                    "PacketEvents failed to add a decoder to the netty pipeline. Pipeline handlers: "
                            + text5,
                    noSuchElementException);
        }
    }

    private static boolean isAlreadyBefore(Channel channel, String text, String text2) {
        List<String> values;
        int value = (values = channel.pipeline().names()).indexOf(text);
        int value2 = values.indexOf(text2);
        if (value == -1) {
            return false;
        } else {
            return value2 == -1 ? true : value < value2;
        }
    }

    private static boolean handlersAlreadyRelocated(
            Channel channel,
            boolean matches,
            String text,
            String text2,
            String text3,
            String text4) {
        if (isAlreadyBefore(channel, text, text2) && isAlreadyBefore(channel, text3, text4)) {
            if (!matches) {
                if (channel.pipeline().get("decompress") != null
                        && !isAlreadyBefore(channel, "decompress", text)) {
                    return false;
                }
                if (channel.pipeline().get("compress") != null
                        && !isAlreadyBefore(channel, "compress", text3)) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }
}
