package dev.esoxiii.bearprotect.lib.kyori.adventure.text.minimessage.translation;

import dev.esoxiii.bearprotect.lib.kyori.adventure.key.Key;
import dev.esoxiii.bearprotect.lib.kyori.adventure.text.minimessage.MiniMessage;
import dev.esoxiii.bearprotect.lib.kyori.adventure.translation.TranslationStore;

import org.jetbrains.annotations.ApiStatus.NonExtendable;
import org.jetbrains.annotations.NotNull;

@NonExtendable
public interface MiniMessageTranslationStore extends TranslationStore.StringBased<String> {

    @NotNull
    static MiniMessageTranslationStore create(@NotNull Key key) {
        return create(key, MiniMessage.miniMessage());
    }

    @NotNull
    static MiniMessageTranslationStore create(@NotNull Key key, @NotNull MiniMessage miniMessage) {
        return new MiniMessageTranslationStoreImpl(key, miniMessage);
    }
}
