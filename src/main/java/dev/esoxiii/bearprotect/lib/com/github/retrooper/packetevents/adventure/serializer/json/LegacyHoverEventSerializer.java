package dev.esoxiii.bearprotect.lib.com.github.retrooper.packetevents.adventure.serializer.json;

import dev.esoxiii.bearprotect.lib.kyori.adventure.text.Component;
import dev.esoxiii.bearprotect.lib.kyori.adventure.text.event.HoverEvent;
import dev.esoxiii.bearprotect.lib.kyori.adventure.util.Codec;

import org.jetbrains.annotations.NotNull;

import java.io.IOException;

public interface LegacyHoverEventSerializer {

    HoverEvent.@NotNull ShowItem deserializeShowItem(@NotNull Component component)
            throws IOException;

    @NotNull
    Component serializeShowItem(HoverEvent.@NotNull ShowItem showItem) throws IOException;

    HoverEvent.@NotNull ShowEntity deserializeShowEntity(
            @NotNull Component component,
            Codec.Decoder<Component, String, ? extends RuntimeException> decoder)
            throws IOException;

    @NotNull
    Component serializeShowEntity(
            HoverEvent.@NotNull ShowEntity showEntity,
            Codec.Encoder<Component, String, ? extends RuntimeException> encoder)
            throws IOException;
}
