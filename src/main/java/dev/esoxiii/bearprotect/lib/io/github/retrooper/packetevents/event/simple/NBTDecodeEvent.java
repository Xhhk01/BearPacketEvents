package dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.event.simple;

import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.event.ProtocolPacketEvent;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.exception.PacketProcessException;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.nbt.NBT;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.nbt.NBTEnd;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.PacketWrapper;

/**
 * Called for every NBT tree read from a packet, before the packet event. Listeners can inspect or
 * replace the tag, or cancel the packet through {@link #getPacketEvent()}.
 */
public class NBTDecodeEvent extends PacketDecodeEvent {

    private final int decodedSizeBytes;

    private NBT nbt;

    public NBTDecodeEvent(
            PacketWrapper<?> wrapper, ProtocolPacketEvent packetEvent, NBT nbt)
            throws PacketProcessException {
        this(wrapper, packetEvent, nbt, nbt.getDecodedSizeBytes());
    }

    public NBTDecodeEvent(
            PacketWrapper<?> wrapper,
            ProtocolPacketEvent packetEvent,
            NBT nbt,
            int decodedSizeBytes)
            throws PacketProcessException {
        super(wrapper, packetEvent);
        this.nbt = nbt;
        this.decodedSizeBytes = decodedSizeBytes;
        if (nbt != NBTEnd.INSTANCE && nbt.getDecodedSizeBytes() < 0) {
            nbt.setDecodedSizeBytes(decodedSizeBytes);
        }
    }

    public NBT getNbt() {
        return this.nbt;
    }

    /** Bytes the value took in the packet. */
    public int getDecodedSizeBytes() {
        return this.decodedSizeBytes;
    }

    public void setNbt(NBT nbt) {
        if (nbt != NBTEnd.INSTANCE && nbt.getDecodedSizeBytes() < 0) {
            nbt.setDecodedSizeBytes(this.decodedSizeBytes);
        }
        this.nbt = nbt;
    }
}
