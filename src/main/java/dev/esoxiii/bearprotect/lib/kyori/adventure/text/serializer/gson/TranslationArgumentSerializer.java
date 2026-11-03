package dev.esoxiii.bearprotect.lib.kyori.adventure.text.serializer.gson;

import dev.esoxiii.bearprotect.lib.gson.Gson;
import dev.esoxiii.bearprotect.lib.gson.TypeAdapter;
import dev.esoxiii.bearprotect.lib.gson.stream.JsonReader;
import dev.esoxiii.bearprotect.lib.gson.stream.JsonWriter;
import dev.esoxiii.bearprotect.lib.kyori.adventure.text.Component;
import dev.esoxiii.bearprotect.lib.kyori.adventure.text.TranslationArgument;

import java.io.IOException;

final class TranslationArgumentSerializer extends TypeAdapter<TranslationArgument> {

    private final Gson gson;

    static TypeAdapter<TranslationArgument> create(Gson gson) {
        return new TranslationArgumentSerializer(gson).nullSafe();
    }

    private TranslationArgumentSerializer(Gson gson2) {
        this.gson = gson2;
    }

    public void write(JsonWriter jsonWriter, TranslationArgument translationArgument)
            throws IOException {
        Object result;
        if ((result = translationArgument.value()) instanceof Boolean) {
            jsonWriter.value((Boolean) result);
        } else if (result instanceof Number) {
            jsonWriter.value((Number) result);
        } else {
            if (!(result instanceof Component)) {
                throw new IllegalStateException(
                        "Unable to serialize translatable argument of type "
                                + result.getClass()
                                + ": "
                                + result);
            }
            this.gson.toJson(result, SerializerFactory.COMPONENT_TYPE, jsonWriter);
        }
    }

    public TranslationArgument read(JsonReader jsonReader) throws IOException {
        switch (jsonReader.peek()) {
            case BOOLEAN:
                return TranslationArgument.bool(jsonReader.nextBoolean());
            case NUMBER:
                return TranslationArgument.numeric(this.gson.fromJson(jsonReader, Number.class));
            default:
                return TranslationArgument.component(
                        this.gson.fromJson(jsonReader, SerializerFactory.COMPONENT_TYPE));
        }
    }
}
