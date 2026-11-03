package dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.configuration.client;

import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.event.PacketReceiveEvent;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.packettype.PacketType;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.PacketWrapper;

import org.jspecify.annotations.NullMarked;

@NullMarked
public class WrapperConfigClientAcceptCodeOfConduct
        extends PacketWrapper<WrapperConfigClientAcceptCodeOfConduct> {

    public WrapperConfigClientAcceptCodeOfConduct(PacketReceiveEvent packetReceiveEvent) {
        super(packetReceiveEvent);
    }

    public WrapperConfigClientAcceptCodeOfConduct() {
        super(PacketType.Configuration.Client.ACCEPT_CODE_OF_CONDUCT);
    }
}
