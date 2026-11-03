package dev.esoxiii.bearprotect.lib.kyori.adventure.text;

import org.jetbrains.annotations.NotNull;

@FunctionalInterface
public interface ComponentApplicable {

    @NotNull
    Component componentApply(@NotNull Component component);
}
