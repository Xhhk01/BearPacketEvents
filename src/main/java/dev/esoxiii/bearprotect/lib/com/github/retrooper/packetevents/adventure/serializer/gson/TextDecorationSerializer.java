package dev.esoxiii.bearprotect.lib.com.github.retrooper.packetevents.adventure.serializer.gson;

import dev.esoxiii.bearprotect.lib.gson.TypeAdapter;
import dev.esoxiii.bearprotect.lib.kyori.adventure.text.format.TextDecoration;

final class TextDecorationSerializer {

    static final TypeAdapter<TextDecoration> INSTANCE =
            IndexedSerializer.strict("text decoration", TextDecoration.NAMES);

    private TextDecorationSerializer() {}
}
