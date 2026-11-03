package dev.esoxiii.bearprotect.lib.kyori.adventure.text.minimessage.tag.standard;

import dev.esoxiii.bearprotect.lib.kyori.adventure.text.Component;
import dev.esoxiii.bearprotect.lib.kyori.adventure.text.KeybindComponent;
import dev.esoxiii.bearprotect.lib.kyori.adventure.text.minimessage.Context;
import dev.esoxiii.bearprotect.lib.kyori.adventure.text.minimessage.ParsingException;
import dev.esoxiii.bearprotect.lib.kyori.adventure.text.minimessage.internal.serializer.Emitable;
import dev.esoxiii.bearprotect.lib.kyori.adventure.text.minimessage.internal.serializer.SerializableResolver;
import dev.esoxiii.bearprotect.lib.kyori.adventure.text.minimessage.tag.Tag;
import dev.esoxiii.bearprotect.lib.kyori.adventure.text.minimessage.tag.resolver.ArgumentQueue;
import dev.esoxiii.bearprotect.lib.kyori.adventure.text.minimessage.tag.resolver.TagResolver;

import org.jetbrains.annotations.Nullable;

final class KeybindTag {

    public static final String KEYBIND = "key";

    static final TagResolver RESOLVER =
            SerializableResolver.claimingComponent("key", KeybindTag::create, KeybindTag::emit);

    private KeybindTag() {}

    static Tag create(ArgumentQueue argumentQueue, Context context) throws ParsingException {
        return Tag.inserting(
                Component.keybind(argumentQueue.popOr("A keybind id is required").value()));
    }

    @Nullable
    static Emitable emit(Component component) {
        if (!(component instanceof KeybindComponent)) {
            return null;
        }
        String text = ((KeybindComponent) component).keybind();
        return result -> result.tag("key").argument(text);
    }
}
