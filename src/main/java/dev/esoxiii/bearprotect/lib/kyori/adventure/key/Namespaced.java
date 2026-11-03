package dev.esoxiii.bearprotect.lib.kyori.adventure.key;

import org.jetbrains.annotations.NotNull;

public interface Namespaced {

    @KeyPattern.Namespace
    @NotNull
    String namespace();
}
