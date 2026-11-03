package dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.event.simple;

import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.event.ProtocolPacketEvent;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.exception.PacketProcessException;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.item.ItemStack;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.PacketWrapper;

/**
 * Called for every item stack read from a packet, before the packet event. Listeners can inspect
 * or replace the item, or cancel the packet through {@link #getPacketEvent()}.
 */
public class ItemStackDecodeEvent extends PacketDecodeEvent {

    private final int decodedSizeBytes;

    private ItemStack itemStack;

    public ItemStackDecodeEvent(
            PacketWrapper<?> wrapper,
            ProtocolPacketEvent packetEvent,
            ItemStack itemStack)
            throws PacketProcessException {
        this(wrapper, packetEvent, itemStack, itemStack.getDecodedSizeBytes());
    }

    public ItemStackDecodeEvent(
            PacketWrapper<?> wrapper,
            ProtocolPacketEvent packetEvent,
            ItemStack itemStack,
            int decodedSizeBytes)
            throws PacketProcessException {
        super(wrapper, packetEvent);
        this.itemStack = itemStack;
        this.decodedSizeBytes = decodedSizeBytes;
        if (itemStack.getDecodedSizeBytes() < 0) {
            itemStack.setDecodedSizeBytes(decodedSizeBytes);
        }
    }

    public ItemStack getItemStack() {
        return this.itemStack;
    }

    /** Bytes the value took in the packet. */
    public int getDecodedSizeBytes() {
        return this.decodedSizeBytes;
    }

    public void setItemStack(ItemStack itemStack) {
        if (itemStack.getDecodedSizeBytes() < 0) {
            itemStack.setDecodedSizeBytes(this.decodedSizeBytes);
        }
        this.itemStack = itemStack;
    }
}
