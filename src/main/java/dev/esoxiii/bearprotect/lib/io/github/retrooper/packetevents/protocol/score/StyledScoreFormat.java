package dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.score;

import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.PacketWrapper;
import dev.esoxiii.bearprotect.lib.kyori.adventure.text.Component;
import dev.esoxiii.bearprotect.lib.kyori.adventure.text.format.Style;

public final class StyledScoreFormat implements ScoreFormat {

    private final Style style;

    public StyledScoreFormat(Style style2) {
        this.style = style2;
    }

    public static StyledScoreFormat read(PacketWrapper<?> packetWrapper) {
        return new StyledScoreFormat(packetWrapper.readStyle());
    }

    public static void write(PacketWrapper<?> packetWrapper, StyledScoreFormat styledScoreFormat) {
        packetWrapper.writeStyle(styledScoreFormat.style);
    }

    @Override
    public Component format(int value) {
        return Component.text(Integer.toString(value), this.style);
    }

    @Override
    public ScoreFormatType<StyledScoreFormat> getType() {
        return ScoreFormatTypes.STYLED;
    }

    public Style getStyle() {
        return this.style;
    }
}
