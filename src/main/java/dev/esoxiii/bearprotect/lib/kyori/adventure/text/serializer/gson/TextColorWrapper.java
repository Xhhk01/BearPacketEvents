package dev.esoxiii.bearprotect.lib.kyori.adventure.text.serializer.gson;

import dev.esoxiii.bearprotect.lib.gson.JsonParseException;
import dev.esoxiii.bearprotect.lib.gson.JsonSyntaxException;
import dev.esoxiii.bearprotect.lib.gson.TypeAdapter;
import dev.esoxiii.bearprotect.lib.gson.stream.JsonReader;
import dev.esoxiii.bearprotect.lib.gson.stream.JsonWriter;
import dev.esoxiii.bearprotect.lib.kyori.adventure.text.format.TextColor;
import dev.esoxiii.bearprotect.lib.kyori.adventure.text.format.TextDecoration;

import org.jetbrains.annotations.Nullable;

import java.io.IOException;

final class TextColorWrapper {

    @Nullable final TextColor color;

    @Nullable final TextDecoration decoration;

    final boolean reset;

    TextColorWrapper(
            @Nullable TextColor textColor, @Nullable TextDecoration textDecoration, boolean reset) {
        this.color = textColor;
        this.decoration = textDecoration;
        this.reset = reset;
    }

    static final class Serializer extends TypeAdapter<TextColorWrapper> {

        static final TextColorWrapper.Serializer INSTANCE = new TextColorWrapper.Serializer();

        private Serializer() {}

        public void write(JsonWriter jsonWriter, TextColorWrapper textColorWrapper) {
            throw new JsonSyntaxException("Cannot write TextColorWrapper instances");
        }

        public TextColorWrapper read(JsonReader jsonReader) throws IOException {
            String text;
            TextColor textColor = TextColorSerializer.fromString(text = jsonReader.nextString());
            TextDecoration textDecoration;
            boolean matches =
                    (textDecoration = TextDecoration.NAMES.value(text)) == null
                            && text.equals("reset");
            if (textColor == null && textDecoration == null && !matches) {
                throw new JsonParseException(
                        "Don't know how to parse " + text + " at " + jsonReader.getPath());
            } else {
                return new TextColorWrapper(textColor, textDecoration, matches);
            }
        }
    }
}
