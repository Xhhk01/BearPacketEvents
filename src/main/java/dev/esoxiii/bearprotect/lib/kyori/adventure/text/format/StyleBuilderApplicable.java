package dev.esoxiii.bearprotect.lib.kyori.adventure.text.format;

import dev.esoxiii.bearprotect.lib.kyori.adventure.text.ComponentBuilder;
import dev.esoxiii.bearprotect.lib.kyori.adventure.text.ComponentBuilderApplicable;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

@FunctionalInterface
public interface StyleBuilderApplicable extends ComponentBuilderApplicable {

    @Contract(mutates = "param")
    void styleApply(Style.@NotNull Builder builder);

    @Override
    default void componentBuilderApply(@NotNull ComponentBuilder<?, ?> componentBuilder) {
        componentBuilder.style(this::styleApply);
    }
}
