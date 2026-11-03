package dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.server;

import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.event.PacketSendEvent;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.packettype.PacketType;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.common.server.WrapperCommonServerPing;

public class WrapperPlayServerPing extends WrapperCommonServerPing<WrapperPlayServerPing> {

    public WrapperPlayServerPing(PacketSendEvent packetSendEvent) {
        super(packetSendEvent);
    }

    public WrapperPlayServerPing(int value) {
        super(PacketType.Play.Server.PING, value);
    }
}
