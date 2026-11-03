package dev.esoxiii.bearprotect.lib.com.github.retrooper.packetevents.adventure.serializer.legacy;

import dev.esoxiii.bearprotect.lib.com.github.retrooper.packetevents.adventure.serializer.ComponentSerializer;
import dev.esoxiii.bearprotect.lib.kyori.adventure.builder.AbstractBuilder;
import dev.esoxiii.bearprotect.lib.kyori.adventure.text.Component;
import dev.esoxiii.bearprotect.lib.kyori.adventure.text.TextComponent;
import dev.esoxiii.bearprotect.lib.kyori.adventure.text.flattener.ComponentFlattener;
import dev.esoxiii.bearprotect.lib.kyori.adventure.text.format.Style;
import dev.esoxiii.bearprotect.lib.kyori.adventure.util.Buildable;
import dev.esoxiii.bearprotect.lib.kyori.adventure.util.PlatformAPI;

import org.jetbrains.annotations.ApiStatus.Internal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.function.Consumer;
import java.util.regex.Pattern;

public interface LegacyComponentSerializer
        extends ComponentSerializer<Component, TextComponent, String>,
                Buildable<LegacyComponentSerializer, LegacyComponentSerializer.Builder> {

    char SECTION_CHAR = '§';

    char AMPERSAND_CHAR = '&';

    char HEX_CHAR = '#';

    @NotNull
    static LegacyComponentSerializer legacySection() {
        return LegacyComponentSerializerImpl.Instances.SECTION;
    }

    @NotNull
    static LegacyComponentSerializer legacyAmpersand() {
        return LegacyComponentSerializerImpl.Instances.AMPERSAND;
    }

    @NotNull
    static LegacyComponentSerializer legacy(char value) {
        if (value == 167) {
            return legacySection();
        } else {
            return value == '&' ? legacyAmpersand() : builder().character(value).build();
        }
    }

    @Nullable
    static LegacyFormat parseChar(char value) {
        return LegacyComponentSerializerImpl.legacyFormat(value);
    }

    @NotNull
    static LegacyComponentSerializer.Builder builder() {
        return new LegacyComponentSerializerImpl.BuilderImpl();
    }

    @NotNull
    TextComponent deserialize(@NotNull String text);

    @NotNull
    String serialize(@NotNull Component component);

    interface Builder
            extends AbstractBuilder<LegacyComponentSerializer>,
                    Buildable.Builder<LegacyComponentSerializer> {

        @NotNull
        LegacyComponentSerializer.Builder character(char value);

        @NotNull
        LegacyComponentSerializer.Builder hexCharacter(char value);

        @NotNull
        LegacyComponentSerializer.Builder extractUrls();

        @NotNull
        LegacyComponentSerializer.Builder extractUrls(@NotNull Pattern pattern);

        @NotNull
        LegacyComponentSerializer.Builder extractUrls(@Nullable Style style);

        @NotNull
        LegacyComponentSerializer.Builder extractUrls(
                @NotNull Pattern pattern, @Nullable Style style);

        @NotNull
        LegacyComponentSerializer.Builder hexColors();

        @NotNull
        LegacyComponentSerializer.Builder useUnusualXRepeatedCharacterHexFormat();

        @NotNull
        LegacyComponentSerializer.Builder flattener(@NotNull ComponentFlattener componentFlattener);

        @NotNull
        LegacyComponentSerializer.Builder formats(@NotNull List<CharacterAndFormat> values);

        @NotNull
        LegacyComponentSerializer build();
    }

    @PlatformAPI
    @Internal
    interface Provider {

        @PlatformAPI
        @Internal
        @NotNull
        LegacyComponentSerializer legacyAmpersand();

        @PlatformAPI
        @Internal
        @NotNull
        LegacyComponentSerializer legacySection();

        @PlatformAPI
        @Internal
        @NotNull
        Consumer<LegacyComponentSerializer.Builder> legacy();
    }
}
