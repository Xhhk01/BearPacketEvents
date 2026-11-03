package dev.esoxiii.bearprotect.lib.gson.internal.bind;

import dev.esoxiii.bearprotect.lib.gson.Gson;
import dev.esoxiii.bearprotect.lib.gson.TypeAdapter;
import dev.esoxiii.bearprotect.lib.gson.TypeAdapterFactory;
import dev.esoxiii.bearprotect.lib.gson.internal.$Gson$Types;
import dev.esoxiii.bearprotect.lib.gson.reflect.TypeToken;
import dev.esoxiii.bearprotect.lib.gson.stream.JsonReader;
import dev.esoxiii.bearprotect.lib.gson.stream.JsonToken;
import dev.esoxiii.bearprotect.lib.gson.stream.JsonWriter;

import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;

public final class ArrayTypeAdapter<E> extends TypeAdapter<Object> {

    public static final TypeAdapterFactory FACTORY =
            new TypeAdapterFactory() {

                @Override
                public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
                    Type type;
                    if ((type = typeToken.getType()) instanceof GenericArrayType
                            || type instanceof Class && ((Class) type).isArray()) {
                        Type arrayComponentType = $Gson$Types.getArrayComponentType(type);
                        TypeAdapter adapter = gson.getAdapter(TypeToken.get(arrayComponentType));
                        return new ArrayTypeAdapter(
                                gson,
                                adapter,
                                (Class<Object>) $Gson$Types.getRawType(arrayComponentType));
                    } else {
                        return null;
                    }
                }
            };

    private final Class<E> componentType;

    private final TypeAdapter<E> componentTypeAdapter;

    public ArrayTypeAdapter(Gson gson, TypeAdapter<E> typeAdapter, Class<E> classValue) {
        this.componentTypeAdapter =
                new TypeAdapterRuntimeTypeWrapper<>(gson, typeAdapter, classValue);
        this.componentType = classValue;
    }

    @Override
    public Object read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        ArrayList<E> values = new ArrayList<>();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            E e = this.componentTypeAdapter.read(jsonReader);
            values.add(e);
        }
        jsonReader.endArray();
        Object result = Array.newInstance(this.componentType, values.size());
        for (int index = 0; index < values.size(); index++) {
            Array.set(result, index, values.get(index));
        }
        return result;
    }

    @Override
    public void write(JsonWriter jsonWriter, Object result) throws IOException {
        if (result == null) {
            jsonWriter.nullValue();
        } else {
            jsonWriter.beginArray();
            int value = 0;
            for (int length = Array.getLength(result); value < length; value++) {
                Object result2 = Array.get(result, value);
                this.componentTypeAdapter.write(jsonWriter, (E) result2);
            }
            jsonWriter.endArray();
        }
    }
}
