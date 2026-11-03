package dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.server;

import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.event.PacketSendEvent;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.debug.DebugSubscription;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.packettype.PacketType;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.PacketWrapper;

import org.jspecify.annotations.NullMarked;

@NullMarked
public class WrapperPlayServerDebugEvent extends PacketWrapper<WrapperPlayServerDebugEvent> {

    private DebugSubscription.Event<?> event;

    public WrapperPlayServerDebugEvent(PacketSendEvent packetSendEvent) {
        super(packetSendEvent);
    }

    public WrapperPlayServerDebugEvent(DebugSubscription.Event<?> event2) {
        super(PacketType.Play.Server.DEBUG_EVENT);
        this.event = event2;
    }

    @Override
    public void read() {
        this.event = DebugSubscription.Event.read(this);
    }

    @Override
    public void write() {
        DebugSubscription.Event.write(this, this.event);
    }

    public void copy(WrapperPlayServerDebugEvent wrapperPlayServerDebugEvent) {
        this.event = wrapperPlayServerDebugEvent.event;
    }

    public DebugSubscription.Event<?> getEvent() {
        return this.event;
    }

    public void setEvent(DebugSubscription.Event<?> event2) {
        this.event = event2;
    }
}
