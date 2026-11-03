package dev.esoxiii.bearprotect.lib.kyori.adventure.text;

import dev.esoxiii.bearprotect.lib.kyori.adventure.util.Buildable;

import org.jetbrains.annotations.NotNull;

@Deprecated
public interface BuildableComponent<
                C extends BuildableComponent<C, B>, B extends ComponentBuilder<C, B>>
        extends Buildable<C, B>, Component {

    @NotNull
    @Override
    B toBuilder();
}
