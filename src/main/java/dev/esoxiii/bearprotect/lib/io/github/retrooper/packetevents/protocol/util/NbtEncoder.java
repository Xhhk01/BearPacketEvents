package dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.util;

import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.nbt.NBT;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.PacketWrapper;

import org.jspecify.annotations.NullMarked;

@NullMarked
@FunctionalInterface
public interface NbtEncoder<T> {

    NBT encode(PacketWrapper<?> packetWrapper, T t) throws NbtCodecException;
}
