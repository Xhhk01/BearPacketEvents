package dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.client;

import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.event.PacketReceiveEvent;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.packettype.PacketType;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.PacketWrapper;

public class WrapperPlayClientPlayerLoaded extends PacketWrapper<WrapperPlayClientPlayerLoaded> {

    public WrapperPlayClientPlayerLoaded(PacketReceiveEvent packetReceiveEvent) {
        super(packetReceiveEvent);
    }

    public WrapperPlayClientPlayerLoaded() {
        super(PacketType.Play.Client.PLAYER_LOADED);
    }
}
