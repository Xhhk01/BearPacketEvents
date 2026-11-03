package dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.configuration.server;

import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.event.PacketSendEvent;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.packettype.PacketType;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.PacketWrapper;
import dev.esoxiii.bearprotect.lib.kyori.adventure.text.Component;

public class WrapperConfigServerDisconnect extends PacketWrapper<WrapperConfigServerDisconnect> {

    private Component reason;

    public WrapperConfigServerDisconnect(PacketSendEvent packetSendEvent) {
        super(packetSendEvent);
    }

    public WrapperConfigServerDisconnect(Component component) {
        super(PacketType.Configuration.Server.DISCONNECT);
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

    public void copy(WrapperConfigServerDisconnect wrapperConfigServerDisconnect) {
        this.reason = wrapperConfigServerDisconnect.reason;
    }

    public Component getReason() {
        return this.reason;
    }

    public void setReason(Component component) {
        this.reason = component;
    }
}
