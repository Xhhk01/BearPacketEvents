package dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.world.generation;

import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.mapper.MappedEntity;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.util.NbtCodec;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.util.NbtCodecs;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.util.NbtMapCodec;

import org.jspecify.annotations.NullMarked;

@NullMarked
public interface BlockPredicateType<T extends BlockPredicate> extends MappedEntity {

    NbtCodec<BlockPredicateType<?>> CODEC =
            NbtCodecs.forRegistry(BlockPredicateTypes.getRegistry());

    NbtMapCodec<T> getCodec();
}
