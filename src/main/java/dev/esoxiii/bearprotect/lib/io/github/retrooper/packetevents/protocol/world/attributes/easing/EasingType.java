package dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.world.attributes.easing;

import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.mapper.MappedEntity;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.util.NbtCodec;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.util.NbtCodecs;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.util.Either;

import org.jspecify.annotations.NullMarked;

@NullMarked
public interface EasingType extends MappedEntity {

    NbtCodec<EasingType> CODEC =
            NbtCodecs.either(
                            NbtCodecs.forRegistry(EasingTypes.getRegistry()),
                            CubicBezierEasingType.CODEC)
                    .apply(
                            Either::unwrap,
                            result ->
                                    result instanceof CubicBezierEasingType
                                            ? Either.createRight((CubicBezierEasingType) result)
                                            : Either.createLeft(result));

    float apply(float value);
}
