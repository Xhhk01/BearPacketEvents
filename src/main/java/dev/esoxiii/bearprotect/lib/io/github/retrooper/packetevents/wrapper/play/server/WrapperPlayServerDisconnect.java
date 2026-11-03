package dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.server;

import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.event.PacketSendEvent;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.packettype.PacketType;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.PacketWrapper;
import dev.esoxiii.bearprotect.lib.kyori.adventure.text.Component;

public class WrapperPlayServerDisconnect extends PacketWrapper<WrapperPlayServerDisconnect> {

    private Component reason;

    public WrapperPlayServerDisconnect(PacketSendEvent packetSendEvent) {
        super(packetSendEvent);
    }

    public WrapperPlayServerDisconnect(Component component) {
        super(PacketType.Play.Server.DISCONNECT);
        this.reason = component;
    }

    @Override
    public void read() {
        this.reason = this.readComponent();
    }

    @Override
    public void write() {
        this.writeComponent(this.reason);
    }

    public void copy(WrapperPlayServerDisconnect wrapperPlayServerDisconnect) {
        this.reason = wrapperPlayServerDisconnect.reason;
    }

    public Component getReason() {
        return this.reason;
    }

    public void setReason(Component component) {
        this.reason = component;
    }
}
