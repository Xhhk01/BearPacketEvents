package dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.world.generation;

import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.util.NbtMapCodec;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.world.generation.predicate.AllOfPredicate;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.world.generation.predicate.AnyOfPredicate;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.world.generation.predicate.HasSturdyFacePredicate;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.world.generation.predicate.HeightRangePredicate;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.world.generation.predicate.InsideWorldBoundsPredicate;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.world.generation.predicate.MatchingBiomesPredicate;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.world.generation.predicate.MatchingBlockTagPredicate;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.world.generation.predicate.MatchingBlocksPredicate;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.world.generation.predicate.MatchingFluidsPredicate;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.world.generation.predicate.NotPredicate;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.world.generation.predicate.ReplaceablePredicate;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.world.generation.predicate.SolidPredicate;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.world.generation.predicate.TrueBlockPredicate;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.world.generation.predicate.UnobstructedPredicate;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.world.generation.predicate.VolumeMatchPredicate;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.world.generation.predicate.WouldSurvivePredicate;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.util.mappings.VersionedRegistry;

import org.jetbrains.annotations.ApiStatus.Internal;
import org.jspecify.annotations.NullMarked;

@NullMarked
public final class BlockPredicateTypes {

    private static final VersionedRegistry<BlockPredicateType<?>> REGISTRY =
            new VersionedRegistry<>("block_predicate_type");

    public static final BlockPredicateType<MatchingBlocksPredicate> MATCHING_BLOCKS =
            define("matching_blocks", MatchingBlocksPredicate.MAP_CODEC);

    public static final BlockPredicateType<MatchingBlockTagPredicate> MATCHING_BLOCK_TAG =
            define("matching_block_tag", MatchingBlockTagPredicate.MAP_CODEC);

    public static final BlockPredicateType<MatchingFluidsPredicate> MATCHING_FLUIDS =
            define("matching_fluids", MatchingFluidsPredicate.MAP_CODEC);

    public static final BlockPredicateType<MatchingBiomesPredicate> MATCHING_BIOMES =
            define("matching_biomes", MatchingBiomesPredicate.MAP_CODEC);

    public static final BlockPredicateType<HasSturdyFacePredicate> HAS_STURDY_FACE =
            define("has_sturdy_face", HasSturdyFacePredicate.MAP_CODEC);

    public static final BlockPredicateType<SolidPredicate> SOLID =
            define("solid", SolidPredicate.MAP_CODEC);

    public static final BlockPredicateType<ReplaceablePredicate> REPLACEABLE =
            define("replaceable", ReplaceablePredicate.MAP_CODEC);

    public static final BlockPredicateType<WouldSurvivePredicate> WOULD_SURVIVE =
            define("would_survive", WouldSurvivePredicate.MAP_CODEC);

    public static final BlockPredicateType<InsideWorldBoundsPredicate> INSIDE_WORLD_BOUNDS =
            define("inside_world_bounds", InsideWorldBoundsPredicate.MAP_CODEC);

    public static final BlockPredicateType<AnyOfPredicate> ANY_OF =
            define("any_of", AnyOfPredicate.MAP_CODEC);

    public static final BlockPredicateType<AllOfPredicate> ALL_OF =
            define("all_of", AllOfPredicate.MAP_CODEC);

    public static final BlockPredicateType<NotPredicate> NOT =
            define("not", NotPredicate.MAP_CODEC);

    public static final BlockPredicateType<TrueBlockPredicate> TRUE =
            define("true", TrueBlockPredicate.MAP_CODEC);

    public static final BlockPredicateType<UnobstructedPredicate> UNOBSTRUCTED =
            define("unobstructed", UnobstructedPredicate.MAP_CODEC);

    public static final BlockPredicateType<HeightRangePredicate> HEIGHT_RANGE =
            define("height_range", HeightRangePredicate.MAP_CODEC);

    public static final BlockPredicateType<VolumeMatchPredicate> VOLUME_MATCH =
            define("volume_match", VolumeMatchPredicate.MAP_CODEC);

    private BlockPredicateTypes() {}

    @Internal
    public static <T extends BlockPredicate> BlockPredicateType<T> define(
            String text, NbtMapCodec<T> nbtMapCodec) {
        return REGISTRY.define(
                text,
                result -> new StaticBlockPredicateType<>(result, ((NbtMapCodec) nbtMapCodec)));
    }

    public static VersionedRegistry<BlockPredicateType<?>> getRegistry() {
        return REGISTRY;
    }

    static {
        REGISTRY.unloadMappings();
    }
}
