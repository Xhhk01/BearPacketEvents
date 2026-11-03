package dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.client;

import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.event.PacketReceiveEvent;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.packettype.PacketType;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.PacketWrapper;

import org.jspecify.annotations.NullMarked;

@NullMarked
public class WrapperPlayClientPunch extends PacketWrapper<WrapperPlayClientPunch> {

    public WrapperPlayClientPunch(PacketReceiveEvent packetReceiveEvent) {
        super(packetReceiveEvent);
    }

    public WrapperPlayClientPunch() {
        super(PacketType.Play.Client.PUNCH);
    }
}
