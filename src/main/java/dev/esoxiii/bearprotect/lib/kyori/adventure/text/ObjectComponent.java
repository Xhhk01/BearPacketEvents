package dev.esoxiii.bearprotect.lib.kyori.adventure.text;

import dev.esoxiii.bearprotect.lib.kyori.adventure.text.object.ObjectContents;
import dev.esoxiii.bearprotect.lib.kyori.examination.ExaminableProperty;

import org.jetbrains.annotations.NotNull;

import java.util.stream.Stream;

public interface ObjectComponent
        extends BuildableComponent<ObjectComponent, ObjectComponent.Builder>,
                ScopedComponent<ObjectComponent> {

    @NotNull
    ObjectContents contents();

    @NotNull
    ObjectComponent contents(@NotNull ObjectContents objectContents);

    @NotNull
    @Override
    default Stream<? extends ExaminableProperty> examinableProperties() {
        return Stream.concat(
                Stream.of(ExaminableProperty.of("contents", this.contents())),
                BuildableComponent.super.examinableProperties());
    }

    interface Builder extends ComponentBuilder<ObjectComponent, ObjectComponent.Builder> {

        @NotNull
        ObjectComponent.Builder contents(@NotNull ObjectContents objectContents);
    }
}
