package dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.configuration.client;

import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.event.PacketReceiveEvent;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.packettype.PacketType;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.PacketWrapper;

public class WrapperConfigClientConfigurationEndAck
        extends PacketWrapper<WrapperConfigClientConfigurationEndAck> {

    public WrapperConfigClientConfigurationEndAck(PacketReceiveEvent packetReceiveEvent) {
        super(packetReceiveEvent);
    }

    public WrapperConfigClientConfigurationEndAck() {
        super(PacketType.Configuration.Client.CONFIGURATION_END_ACK);
    }
}
