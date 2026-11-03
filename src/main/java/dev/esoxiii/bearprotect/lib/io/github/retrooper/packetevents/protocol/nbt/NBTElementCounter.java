package dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.nbt;

import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.exception.PacketLimitException;

import org.jspecify.annotations.NullMarked;

/** Counts NBT tags across every item of one packet, so many small items can't add up to a huge tree. */
@NullMarked
public final class NBTElementCounter {

    private final int max;

    private int count;

    public NBTElementCounter(int max) {
        this.max = max;
    }

    public void add(int count) {
        if (count < 0) {
            throw new IllegalArgumentException(
                    "Can't count a negative amount of NBT elements: " + count);
        }
        long total = (long) this.count + count;
        if (total > this.max) {
            throw new PacketLimitException(PacketLimitException.Limit.NBT_ELEMENTS, total, this.max);
        }
        this.count = (int) total;
    }
}
