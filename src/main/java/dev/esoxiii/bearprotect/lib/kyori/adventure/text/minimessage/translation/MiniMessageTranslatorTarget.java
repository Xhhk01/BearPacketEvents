package dev.esoxiii.bearprotect.lib.kyori.adventure.text.minimessage.translation;

import dev.esoxiii.bearprotect.lib.kyori.adventure.pointer.Pointered;
import dev.esoxiii.bearprotect.lib.kyori.adventure.text.ComponentLike;
import dev.esoxiii.bearprotect.lib.kyori.adventure.text.VirtualComponentRenderer;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.UnknownNullability;

final class MiniMessageTranslatorTarget implements VirtualComponentRenderer<Void> {

    private final Pointered pointered;

    MiniMessageTranslatorTarget(@NotNull Pointered pointered2) {
        this.pointered = pointered2;
    }

    @NotNull
    Pointered pointered() {
        return this.pointered;
    }

    @UnknownNullability
    public ComponentLike apply(@NotNull Void voidValue) {
        return null;
    }
}
