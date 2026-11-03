package dev.esoxiii.bearprotect.lib.kyori.adventure.text.serializer.gson;

import dev.esoxiii.bearprotect.lib.gson.JsonElement;
import dev.esoxiii.bearprotect.lib.gson.JsonNull;
import dev.esoxiii.bearprotect.lib.kyori.adventure.text.event.DataComponentValue;

import org.jetbrains.annotations.ApiStatus.NonExtendable;
import org.jetbrains.annotations.NotNull;

import java.util.Objects;

@NonExtendable
public interface GsonDataComponentValue extends DataComponentValue {

    static GsonDataComponentValue gsonDataComponentValue(@NotNull JsonElement jsonElement) {
        return jsonElement instanceof JsonNull
                ? GsonDataComponentValueImpl.RemovedGsonComponentValueImpl.INSTANCE
                : new GsonDataComponentValueImpl(Objects.requireNonNull(jsonElement, "data"));
    }

    @NotNull
    JsonElement element();
}
