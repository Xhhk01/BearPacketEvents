package dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.score;

import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.PacketWrapper;
import dev.esoxiii.bearprotect.lib.kyori.adventure.text.Component;
import dev.esoxiii.bearprotect.lib.kyori.adventure.text.format.Style;

import org.jetbrains.annotations.ApiStatus.NonExtendable;

@NonExtendable
public interface ScoreFormat {

    static BlankScoreFormat blankScore() {
        return BlankScoreFormat.INSTANCE;
    }

    static StyledScoreFormat styledScore(Style style) {
        return new StyledScoreFormat(style);
    }

    static FixedScoreFormat fixedScore(Component component) {
        return new FixedScoreFormat(component);
    }

    static ScoreFormat readTyped(PacketWrapper<?> packetWrapper) {
        return packetWrapper.readMappedEntity(ScoreFormatTypes.getRegistry()).read(packetWrapper);
    }

    static <T extends ScoreFormat> void writeTyped(PacketWrapper<?> packetWrapper, T t) {
        packetWrapper.writeMappedEntity(t.getType());
        ((ScoreFormatType<ScoreFormat>) t.getType()).write(packetWrapper, t);
    }

    Component format(int value);

    ScoreFormatType<?> getType();
}
