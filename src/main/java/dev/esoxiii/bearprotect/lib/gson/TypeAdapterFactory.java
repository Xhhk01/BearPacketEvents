package dev.esoxiii.bearprotect.lib.gson;

import dev.esoxiii.bearprotect.lib.gson.reflect.TypeToken;

public interface TypeAdapterFactory {

    <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken);
}
