package dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.entity.data.struct;

import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.PacketWrapper;

import org.jspecify.annotations.NullMarked;

@NullMarked
public enum WeatheringCopperState {
    UNAFFECTED,
    EXPOSED,
    WEATHERED,
    OXIDIZED;

    private static final WeatheringCopperState[] STATES = values();

    public static WeatheringCopperState read(PacketWrapper<?> packetWrapper) {
        return packetWrapper.readEnum(STATES);
    }

    public static void write(
            PacketWrapper<?> packetWrapper, WeatheringCopperState weatheringCopperState) {
        packetWrapper.writeEnum(weatheringCopperState);
    }
}
