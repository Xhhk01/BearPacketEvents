package dev.esoxiii.bearprotect.lib.kyori.adventure.text.minimessage.tag;

import dev.esoxiii.bearprotect.lib.kyori.adventure.text.Component;

import org.jetbrains.annotations.NotNull;

public interface Inserting extends Tag {

    @NotNull
    Component value();

    default boolean allowsChildren() {
        return true;
    }
}
