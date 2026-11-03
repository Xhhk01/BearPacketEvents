package dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.world.attributes.modifiers;

import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.util.NbtCodec;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.util.NbtCodecs;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.world.attributes.EnvironmentAttribute;

import org.jspecify.annotations.NullMarked;

@NullMarked
public interface IntegerModifier<A> extends AttributeModifier<Integer, A> {

    IntegerModifier<Integer> ADD =
            ((dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.world.attributes.modifiers
                            .IntegerModifier.Simple)
                    Integer::sum);

    IntegerModifier<Integer> SUBTRACT =
            (IntegerModifier.Simple) (result, result2) -> result - result2;

    IntegerModifier<Integer> MULTIPLY =
            (IntegerModifier.Simple) (result, result2) -> result * result2;

    IntegerModifier<Integer> MINIMUM =
            ((dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.world.attributes.modifiers
                            .IntegerModifier.Simple)
                    Math::min);

    IntegerModifier<Integer> MAXIMUM =
            ((dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.world.attributes.modifiers
                            .IntegerModifier.Simple)
                    Math::max);

    @FunctionalInterface
    interface Simple extends IntegerModifier<Integer> {

        @Override
        default NbtCodec<Integer> argumentCodec(
                EnvironmentAttribute<Integer> environmentAttribute) {
            return NbtCodecs.INT;
        }
    }
}
