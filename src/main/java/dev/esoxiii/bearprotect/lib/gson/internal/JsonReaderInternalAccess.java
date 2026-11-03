package dev.esoxiii.bearprotect.lib.gson.internal;

import dev.esoxiii.bearprotect.lib.gson.stream.JsonReader;

import java.io.IOException;

public abstract class JsonReaderInternalAccess {

    public static JsonReaderInternalAccess INSTANCE;

    public abstract void promoteNameToValue(JsonReader jsonReader) throws IOException;
}
