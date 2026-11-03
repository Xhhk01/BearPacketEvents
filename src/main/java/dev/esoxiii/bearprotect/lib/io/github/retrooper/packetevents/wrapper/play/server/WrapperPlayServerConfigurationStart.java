package dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.server;

import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.event.PacketSendEvent;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.packettype.PacketType;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.PacketWrapper;

public class WrapperPlayServerConfigurationStart
        extends PacketWrapper<WrapperPlayServerConfigurationStart> {

    public WrapperPlayServerConfigurationStart(PacketSendEvent packetSendEvent) {
        super(packetSendEvent);
    }

    public WrapperPlayServerConfigurationStart() {
        super(PacketType.Play.Server.CONFIGURATION_START);
    }
}
