package dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.util;

import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.nbt.NBT;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.PacketWrapper;

import org.jspecify.annotations.NullMarked;

@NullMarked
@FunctionalInterface
public interface NbtDecoder<T> {

    T decode(NBT nBT, PacketWrapper<?> packetWrapper) throws NbtCodecException;
}
