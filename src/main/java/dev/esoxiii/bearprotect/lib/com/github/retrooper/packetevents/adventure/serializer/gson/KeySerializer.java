package dev.esoxiii.bearprotect.lib.com.github.retrooper.packetevents.adventure.serializer.gson;

import dev.esoxiii.bearprotect.lib.gson.TypeAdapter;
import dev.esoxiii.bearprotect.lib.gson.stream.JsonReader;
import dev.esoxiii.bearprotect.lib.gson.stream.JsonWriter;
import dev.esoxiii.bearprotect.lib.kyori.adventure.key.Key;

import java.io.IOException;

final class KeySerializer extends TypeAdapter<Key> {

    static final TypeAdapter<Key> INSTANCE = new KeySerializer().nullSafe();

    private KeySerializer() {}

    public void write(JsonWriter jsonWriter, Key key) throws IOException {
        jsonWriter.value(key.asString());
    }

    public Key read(JsonReader jsonReader) throws IOException {
        return Key.key(jsonReader.nextString());
    }
}
