package dev.esoxiii.bearprotect.lib.com.github.retrooper.packetevents.adventure.serializer.gson;

import dev.esoxiii.bearprotect.lib.gson.JsonParseException;
import dev.esoxiii.bearprotect.lib.gson.TypeAdapter;
import dev.esoxiii.bearprotect.lib.gson.stream.JsonReader;
import dev.esoxiii.bearprotect.lib.gson.stream.JsonWriter;
import dev.esoxiii.bearprotect.lib.kyori.adventure.util.Index;

import java.io.IOException;

final class IndexedSerializer<E> extends TypeAdapter<E> {

    private final String name;

    private final Index<String, E> map;

    private final boolean throwOnUnknownKey;

    public static <E> TypeAdapter<E> strict(String text, Index<String, E> index) {
        return new IndexedSerializer(text, index, true).nullSafe();
    }

    public static <E> TypeAdapter<E> lenient(String text, Index<String, E> index) {
        return new IndexedSerializer(text, index, false).nullSafe();
    }

    private IndexedSerializer(String name, Index<String, E> index, boolean throwOnUnknownKey) {
        this.name = name;
        this.map = index;
        this.throwOnUnknownKey = throwOnUnknownKey;
    }

    @Override
    public void write(JsonWriter jsonWriter, E e) throws IOException {
        jsonWriter.value(this.map.key((E) e));
    }

    @Override
    public E read(JsonReader jsonReader) throws IOException {
        String text = jsonReader.nextString();
        E e;
        if ((e = this.map.value(text)) != null) {
            return (E) e;
        } else if (this.throwOnUnknownKey) {
            throw new JsonParseException("invalid " + this.name + ":  " + text);
        } else {
            return null;
        }
    }
}
