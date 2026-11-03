package dev.esoxiii.bearprotect.lib.kyori.adventure.text.serializer.gson;

import dev.esoxiii.bearprotect.lib.gson.JsonParseException;
import dev.esoxiii.bearprotect.lib.gson.TypeAdapter;
import dev.esoxiii.bearprotect.lib.gson.stream.JsonReader;
import dev.esoxiii.bearprotect.lib.gson.stream.JsonWriter;
import dev.esoxiii.bearprotect.lib.kyori.adventure.text.BlockNBTComponent;

import java.io.IOException;

final class BlockNBTComponentPosSerializer extends TypeAdapter<BlockNBTComponent.Pos> {

    static final TypeAdapter<BlockNBTComponent.Pos> INSTANCE =
            new BlockNBTComponentPosSerializer().nullSafe();

    private BlockNBTComponentPosSerializer() {}

    public BlockNBTComponent.Pos read(JsonReader jsonReader) throws IOException {
        String text = jsonReader.nextString();
        try {
            return BlockNBTComponent.Pos.fromString(text);
        } catch (IllegalArgumentException illegalArgumentException) {
            throw new JsonParseException("Don't know how to turn " + text + " into a Position");
        }
    }

    public void write(JsonWriter jsonWriter, BlockNBTComponent.Pos pos) throws IOException {
        jsonWriter.value(pos.asString());
    }
}
