package dev.esoxiii.bearprotect.lib.kyori.adventure.text.event;

import dev.esoxiii.bearprotect.lib.kyori.adventure.audience.Audience;
import dev.esoxiii.bearprotect.lib.kyori.adventure.permission.PermissionChecker;
import dev.esoxiii.bearprotect.lib.kyori.adventure.util.Services;
import dev.esoxiii.bearprotect.lib.kyori.adventure.util.TriState;

import org.jetbrains.annotations.NotNull;

final class ClickCallbackInternals {

    static final PermissionChecker ALWAYS_FALSE = PermissionChecker.always(TriState.FALSE);

    static final ClickCallback.Provider PROVIDER =
            Services.service(ClickCallback.Provider.class)
                    .orElseGet(ClickCallbackInternals.Fallback::new);

    private ClickCallbackInternals() {}

    static final class Fallback implements ClickCallback.Provider {

        @NotNull
        @Override
        public ClickEvent create(
                @NotNull ClickCallback<Audience> clickCallback,
                ClickCallback.@NotNull Options options) {
            return ClickEvent.suggestCommand("Callbacks are not supported on this platform!");
        }
    }
}
