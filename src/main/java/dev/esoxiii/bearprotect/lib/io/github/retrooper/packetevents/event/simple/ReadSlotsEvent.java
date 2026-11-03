package dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.event.simple;

import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.event.ProtocolPacketEvent;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.exception.PacketProcessException;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.PacketWrapper;

/**
 * Called when a packet announces how many slots it is about to read (window clicks, inventory
 * contents), so oversized arrays can be rejected before they are allocated.
 */
public class ReadSlotsEvent extends PacketDecodeEvent {

    private int slotCount;

    public ReadSlotsEvent(
            PacketWrapper<?> wrapper, ProtocolPacketEvent packetEvent, int slotCount)
            throws PacketProcessException {
        super(wrapper, packetEvent);
        this.slotCount = slotCount;
    }

    public int getSlotCount() {
        return this.slotCount;
    }
}
