package dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.event.simple;

import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.event.PacketEvent;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.event.ProtocolPacketEvent;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.PacketWrapper;

/**
 * Base of the events fired while a packet is still being read: {@link ItemStackDecodeEvent},
 * {@link NBTDecodeEvent} and {@link ReadSlotsEvent}. They run before the packet event itself, so a
 * listener can stop a malicious packet before the rest of it is decoded.
 */
public abstract class PacketDecodeEvent extends PacketEvent {

    private final PacketWrapper<?> wrapper;

    private final ProtocolPacketEvent packetEvent;

    protected PacketDecodeEvent(PacketWrapper<?> wrapper, ProtocolPacketEvent packetEvent) {
        this.wrapper = wrapper;
        this.packetEvent = packetEvent;
    }

    /** The packet being read. */
    public PacketWrapper<?> getWrapper() {
        return this.wrapper;
    }

    /** The receive or send event of the packet, cancel it to drop the packet. */
    public ProtocolPacketEvent getPacketEvent() {
        return this.packetEvent;
    }
}
