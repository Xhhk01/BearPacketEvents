package dev.esoxiii.bearprotect.lib.kyori.adventure.text.serializer.plain;

import dev.esoxiii.bearprotect.lib.kyori.adventure.builder.AbstractBuilder;
import dev.esoxiii.bearprotect.lib.kyori.adventure.text.Component;
import dev.esoxiii.bearprotect.lib.kyori.adventure.text.KeybindComponent;
import dev.esoxiii.bearprotect.lib.kyori.adventure.text.TextComponent;
import dev.esoxiii.bearprotect.lib.kyori.adventure.text.TranslatableComponent;
import dev.esoxiii.bearprotect.lib.kyori.adventure.text.flattener.ComponentFlattener;
import dev.esoxiii.bearprotect.lib.kyori.adventure.text.serializer.ComponentSerializer;
import dev.esoxiii.bearprotect.lib.kyori.adventure.util.Buildable;

import org.jetbrains.annotations.ApiStatus.ScheduledForRemoval;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.function.Function;

@Deprecated
@ScheduledForRemoval(inVersion = "5.0.0")
public class PlainComponentSerializer
        implements ComponentSerializer<Component, TextComponent, String>,
                Buildable<PlainComponentSerializer, PlainComponentSerializer.Builder> {

    @Deprecated final PlainTextComponentSerializer serializer;

    @Deprecated
    @ScheduledForRemoval(inVersion = "5.0.0")
    @NotNull
    public static PlainComponentSerializer plain() {
        return PlainComponentSerializerImpl.INSTANCE;
    }

    @Deprecated
    @ScheduledForRemoval(inVersion = "5.0.0")
    public static PlainComponentSerializer.@NotNull Builder builder() {
        return new PlainComponentSerializerImpl.BuilderImpl();
    }

    @Deprecated
    @ScheduledForRemoval(inVersion = "5.0.0")
    public PlainComponentSerializer() {
        this(PlainTextComponentSerializer.plainText());
    }

    @Deprecated
    @ScheduledForRemoval(inVersion = "5.0.0")
    public PlainComponentSerializer(
            @Nullable Function<KeybindComponent, String> function,
            @Nullable Function<TranslatableComponent, String> function2) {
        this(
                PlainComponentSerializerImpl.createRealSerializerFromLegacyFunctions(
                        function, function2));
    }

    @Deprecated
    PlainComponentSerializer(@NotNull PlainTextComponentSerializer plainTextComponentSerializer) {
        this.serializer = plainTextComponentSerializer;
    }

    @NotNull
    public TextComponent deserialize(@NotNull String text) {
        return this.serializer.deserialize(text);
    }

    @NotNull
    public String serialize(@NotNull Component component) {
        return this.serializer.serialize(component);
    }

    @Deprecated
    @ScheduledForRemoval(inVersion = "5.0.0")
    public void serialize(@NotNull StringBuilder stringBuilder, @NotNull Component component) {
        this.serializer.serialize(stringBuilder, component);
    }

    public PlainComponentSerializer.@NotNull Builder toBuilder() {
        return new PlainComponentSerializerImpl.BuilderImpl(this);
    }

    @Deprecated
    @ScheduledForRemoval(inVersion = "5.0.0")
    public interface Builder
            extends AbstractBuilder<PlainComponentSerializer>,
                    Buildable.Builder<PlainComponentSerializer> {

        @Deprecated
        @ScheduledForRemoval(inVersion = "5.0.0")
        @NotNull
        PlainComponentSerializer.Builder flattener(@NotNull ComponentFlattener componentFlattener);
    }
}
