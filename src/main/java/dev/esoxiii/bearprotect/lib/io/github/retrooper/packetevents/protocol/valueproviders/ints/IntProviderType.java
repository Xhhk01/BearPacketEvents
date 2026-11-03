package dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.valueproviders.ints;

import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.mapper.MappedEntity;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.util.NbtCodec;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.util.NbtCodecs;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.util.NbtMapCodec;

import org.jspecify.annotations.NullMarked;

@NullMarked
public interface IntProviderType<T extends IntProvider> extends MappedEntity {

    NbtCodec<IntProviderType<?>> CODEC = NbtCodecs.forRegistry(IntProviderTypes.getRegistry());

    NbtMapCodec<T> getCodec();
}
