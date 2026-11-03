package dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.configuration.server;

import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.event.PacketSendEvent;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.packettype.PacketType;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.common.server.WrapperCommonServerPing;

public class WrapperConfigServerPing extends WrapperCommonServerPing<WrapperConfigServerPing> {

    public WrapperConfigServerPing(PacketSendEvent packetSendEvent) {
        super(packetSendEvent);
    }

    public WrapperConfigServerPing(int value) {
        super(PacketType.Configuration.Server.PING, value);
    }
}
