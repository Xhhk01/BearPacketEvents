package dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.world.attributes.modifiers;

import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.color.AlphaColor;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.color.Color;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.util.NbtCodec;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.util.NbtCodecs;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.world.attributes.EnvironmentAttribute;

import org.jspecify.annotations.NullMarked;

@NullMarked
public interface ColorModifier<A> extends AttributeModifier<Color, A> {

    ColorModifier<AlphaColor> ALPHA_BLEND =
            ((dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.world.attributes.modifiers
                            .ColorModifier.ArgbModifier)
                    Color::blendWith);

    ColorModifier<Color> ADD =
            ((dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.world.attributes.modifiers
                            .ColorModifier.RgbModifier)
                    Color::plus);

    ColorModifier<Color> SUBTRACT =
            ((dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.world.attributes.modifiers
                            .ColorModifier.RgbModifier)
                    Color::minus);

    ColorModifier<Color> MULTIPLY =
            ((dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.world.attributes.modifiers
                            .ColorModifier.RgbModifier)
                    Color::times);

    ColorModifier<BlendToGrayArgument> BLEND_TO_GRAY =
            new ColorModifier<BlendToGrayArgument>() {

                public Color apply(Color color, BlendToGrayArgument blendToGrayArgument) {
                    return blendToGrayArgument.blend(color);
                }

                @Override
                public NbtCodec<BlendToGrayArgument> argumentCodec(
                        EnvironmentAttribute<Color> environmentAttribute) {
                    return BlendToGrayArgument.CODEC;
                }
            };

    @FunctionalInterface
    interface ArgbModifier extends ColorModifier<AlphaColor> {

        @Override
        default NbtCodec<AlphaColor> argumentCodec(
                EnvironmentAttribute<Color> environmentAttribute) {
            return NbtCodecs.ARGB_COLOR;
        }
    }

    @FunctionalInterface
    interface RgbModifier extends ColorModifier<Color> {

        @Override
        default NbtCodec<Color> argumentCodec(EnvironmentAttribute<Color> environmentAttribute) {
            return NbtCodecs.RGB_COLOR;
        }
    }
}
