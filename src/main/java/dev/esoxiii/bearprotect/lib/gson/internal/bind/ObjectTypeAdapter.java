package dev.esoxiii.bearprotect.lib.gson.internal.bind;

import dev.esoxiii.bearprotect.lib.gson.Gson;
import dev.esoxiii.bearprotect.lib.gson.TypeAdapter;
import dev.esoxiii.bearprotect.lib.gson.TypeAdapterFactory;
import dev.esoxiii.bearprotect.lib.gson.internal.LinkedTreeMap;
import dev.esoxiii.bearprotect.lib.gson.reflect.TypeToken;
import dev.esoxiii.bearprotect.lib.gson.stream.JsonReader;
import dev.esoxiii.bearprotect.lib.gson.stream.JsonToken;
import dev.esoxiii.bearprotect.lib.gson.stream.JsonWriter;

import java.io.IOException;
import java.util.ArrayList;

public final class ObjectTypeAdapter extends TypeAdapter<Object> {

    public static final TypeAdapterFactory FACTORY =
            new TypeAdapterFactory() {

                @Override
                public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
                    return (((TypeAdapter<T>)
                            (typeToken.getRawType() == Object.class
                                    ? new ObjectTypeAdapter(gson)
                                    : null)));
                }
            };

    private final Gson gson;

    ObjectTypeAdapter(Gson gson2) {
        this.gson = gson2;
    }

    @Override
    public Object read(JsonReader jsonReader) throws IOException {
        JsonToken jsonToken = jsonReader.peek();
        switch (jsonToken) {
            case BEGIN_ARRAY:
                ArrayList values = new ArrayList();
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    values.add(this.read(jsonReader));
                }
                jsonReader.endArray();
                return values;
            case BEGIN_OBJECT:
                LinkedTreeMap linkedTreeMap = new LinkedTreeMap();
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    linkedTreeMap.put(jsonReader.nextName(), this.read(jsonReader));
                }
                jsonReader.endObject();
                return linkedTreeMap;
            case STRING:
                return jsonReader.nextString();
            case NUMBER:
                return jsonReader.nextDouble();
            case BOOLEAN:
                return jsonReader.nextBoolean();
            case NULL:
                jsonReader.nextNull();
                return null;
            default:
                throw new IllegalStateException();
        }
    }

    @Override
    public void write(JsonWriter jsonWriter, Object result) throws IOException {
        if (result == null) {
            jsonWriter.nullValue();
        } else {
            TypeAdapter typeAdapter;
            if ((typeAdapter = this.gson.getAdapter(result.getClass()))
                    instanceof ObjectTypeAdapter) {
                jsonWriter.beginObject();
                jsonWriter.endObject();
            } else {
                typeAdapter.write(jsonWriter, result);
            }
        }
    }
}
