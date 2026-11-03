package dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.server;

import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.event.PacketSendEvent;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.packettype.PacketType;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.PacketWrapper;

public class WrapperPlayServerBundle extends PacketWrapper<WrapperPlayServerBundle> {

    public WrapperPlayServerBundle(PacketSendEvent packetSendEvent) {
        super(packetSendEvent);
    }

    public WrapperPlayServerBundle() {
        super(PacketType.Play.Server.BUNDLE);
    }
}
