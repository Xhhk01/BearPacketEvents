package dev.esoxiii.bearprotect.lib.com.github.retrooper.packetevents.adventure.serializer.gson;

import dev.esoxiii.bearprotect.lib.com.github.retrooper.packetevents.adventure.option.OptionState;
import dev.esoxiii.bearprotect.lib.com.github.retrooper.packetevents.adventure.serializer.json.JSONOptions;
import dev.esoxiii.bearprotect.lib.gson.TypeAdapter;
import dev.esoxiii.bearprotect.lib.gson.stream.JsonReader;
import dev.esoxiii.bearprotect.lib.gson.stream.JsonToken;
import dev.esoxiii.bearprotect.lib.gson.stream.JsonWriter;

import java.io.IOException;
import java.util.UUID;

final class UUIDSerializer extends TypeAdapter<UUID> {

    private final boolean emitIntArray;

    static TypeAdapter<UUID> uuidSerializer(OptionState optionState) {
        return new UUIDSerializer(
                        optionState.value(JSONOptions.EMIT_HOVER_SHOW_ENTITY_ID_AS_INT_ARRAY))
                .nullSafe();
    }

    private UUIDSerializer(boolean emitIntArray) {
        this.emitIntArray = emitIntArray;
    }

    public void write(JsonWriter jsonWriter, UUID uUID) throws IOException {
        if (this.emitIntArray) {
            int value2 = (int) (uUID.getMostSignificantBits() >> 32);
            int value3 = (int) (uUID.getMostSignificantBits() & 4294967295L);
            int value4 = (int) (uUID.getLeastSignificantBits() >> 32);
            int value5 = (int) (uUID.getLeastSignificantBits() & 4294967295L);
            jsonWriter
                    .beginArray()
                    .value(value2)
                    .value(value3)
                    .value(value4)
                    .value(value5)
                    .endArray();
        } else {
            jsonWriter.value(uUID.toString());
        }
    }

    public UUID read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.BEGIN_ARRAY) {
            jsonReader.beginArray();
            int value = jsonReader.nextInt();
            int value2 = jsonReader.nextInt();
            int value3 = jsonReader.nextInt();
            int value4 = jsonReader.nextInt();
            jsonReader.endArray();
            return new UUID(
                    (long) value << 32 | value2 & 4294967295L,
                    (long) value3 << 32 | value4 & 4294967295L);
        } else {
            return UUID.fromString(jsonReader.nextString());
        }
    }
}
