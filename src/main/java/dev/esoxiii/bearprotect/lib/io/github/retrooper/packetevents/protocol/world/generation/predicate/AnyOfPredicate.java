package dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.world.generation.predicate;

import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.util.NbtMapCodec;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.world.generation.BlockPredicate;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.world.generation.BlockPredicateType;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.world.generation.BlockPredicateTypes;

import org.jspecify.annotations.NullMarked;

import java.util.List;

@NullMarked
public final class AnyOfPredicate extends CombiningPredicate {

    public static final NbtMapCodec<AnyOfPredicate> MAP_CODEC = codec(AnyOfPredicate::new);

    public AnyOfPredicate(List<BlockPredicate> values) {
        super(values);
    }

    @Override
    public BlockPredicateType<?> getType() {
        return BlockPredicateTypes.ANY_OF;
    }
}
