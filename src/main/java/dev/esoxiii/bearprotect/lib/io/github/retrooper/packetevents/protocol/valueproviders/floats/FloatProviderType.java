package dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.valueproviders.floats;

import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.mapper.MappedEntity;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.util.NbtCodec;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.util.NbtCodecs;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.util.NbtMapCodec;

import org.jspecify.annotations.NullMarked;

@NullMarked
public interface FloatProviderType<T extends FloatProvider> extends MappedEntity {

    NbtCodec<FloatProviderType<?>> CODEC = NbtCodecs.forRegistry(FloatProviderTypes.getRegistry());

    NbtMapCodec<T> getCodec();
}
