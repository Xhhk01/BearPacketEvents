package dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.util;

import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.nbt.NBTCompound;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.PacketWrapper;

import org.jspecify.annotations.NullMarked;

@NullMarked
@FunctionalInterface
public interface NbtMapDecoder<T> {

    T decode(NBTCompound nBTCompound, PacketWrapper<?> packetWrapper) throws NbtCodecException;
}
