package dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.nbt;

import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.util.MathUtil;

/** Rounding helpers used when NBT numbers are read as a smaller type. */
public final class MathHelper {

    private MathHelper() {}

    public static int floor(float value) {
        return MathUtil.floor(value);
    }

    public static int floor(double value) {
        return MathUtil.floor(value);
    }

    public static long floorLong(double value) {
        long truncated = (long) value;
        return value < truncated ? truncated - 1L : truncated;
    }

    public static float abs(float value) {
        return value >= 0.0F ? value : -value;
    }

    public static int abs(int value) {
        return value >= 0 ? value : -value;
    }

    public static int ceil(float value) {
        int truncated = (int) value;
        return value > truncated ? truncated + 1 : truncated;
    }

    public static int ceil(double value) {
        int truncated = (int) value;
        return value > truncated ? truncated + 1 : truncated;
    }
}
