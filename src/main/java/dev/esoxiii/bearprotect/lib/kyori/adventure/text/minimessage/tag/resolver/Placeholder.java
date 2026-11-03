package dev.esoxiii.bearprotect.lib.kyori.adventure.text.minimessage.tag.resolver;

import dev.esoxiii.bearprotect.lib.kyori.adventure.text.Component;
import dev.esoxiii.bearprotect.lib.kyori.adventure.text.ComponentLike;
import dev.esoxiii.bearprotect.lib.kyori.adventure.text.format.StyleBuilderApplicable;
import dev.esoxiii.bearprotect.lib.kyori.adventure.text.minimessage.tag.Tag;
import dev.esoxiii.bearprotect.lib.kyori.adventure.text.minimessage.tag.TagPattern;

import org.jetbrains.annotations.NotNull;

import java.util.Objects;

public final class Placeholder {

    private Placeholder() {}

    public static TagResolver.@NotNull Single parsed(
            @TagPattern @NotNull String text, @NotNull String text2) {
        return TagResolver.resolver(text, Tag.preProcessParsed(text2));
    }

    public static TagResolver.@NotNull Single unparsed(
            @TagPattern @NotNull String text2, @NotNull String text3) {
        Objects.requireNonNull(text3, "value");
        return component(text2, Component.text(text3));
    }

    public static TagResolver.@NotNull Single component(
            @TagPattern @NotNull String text, @NotNull ComponentLike componentLike) {
        return TagResolver.resolver(text, Tag.selfClosingInserting(componentLike));
    }

    public static TagResolver.@NotNull Single styling(
            @TagPattern @NotNull String text,
            @NotNull StyleBuilderApplicable... styleBuilderApplicable) {
        return TagResolver.resolver(text, Tag.styling(styleBuilderApplicable));
    }
}
