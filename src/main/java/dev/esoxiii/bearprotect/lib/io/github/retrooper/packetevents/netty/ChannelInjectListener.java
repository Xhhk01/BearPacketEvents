package dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.netty;

import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.player.User;

/**
 * Called right after PacketEvents added its handlers to a new connection, so a plugin can add its
 * own handlers next to them. Register it with {@code PacketEventsSettings#addChannelInjectListener}.
 */
@FunctionalInterface
public interface ChannelInjectListener {

    /**
     * @param channel the netty channel of the connection
     * @param user the PacketEvents user of the connection
     * @param preVia true when the handlers sit before ViaVersion's, so packets are seen in the
     *     client's own protocol version
     */
    void onInject(Object channel, User user, boolean preVia);
}
