package dev.esoxiii.bearprotect.lib.kyori.adventure.text.minimessage.tag.standard;

import dev.esoxiii.bearprotect.lib.kyori.adventure.text.Component;
import dev.esoxiii.bearprotect.lib.kyori.adventure.text.minimessage.Context;
import dev.esoxiii.bearprotect.lib.kyori.adventure.text.minimessage.ParsingException;
import dev.esoxiii.bearprotect.lib.kyori.adventure.text.minimessage.internal.serializer.Emitable;
import dev.esoxiii.bearprotect.lib.kyori.adventure.text.minimessage.internal.serializer.SerializableResolver;
import dev.esoxiii.bearprotect.lib.kyori.adventure.text.minimessage.tag.Tag;
import dev.esoxiii.bearprotect.lib.kyori.adventure.text.minimessage.tag.resolver.ArgumentQueue;
import dev.esoxiii.bearprotect.lib.kyori.adventure.text.minimessage.tag.resolver.TagResolver;

import org.jetbrains.annotations.Nullable;

final class NewlineTag {

    static final TagResolver RESOLVER =
            SerializableResolver.claimingComponent(
                    StandardTags.names("newline", "br"),
                    NewlineTag::create,
                    NewlineTag::claimComponent);

    private NewlineTag() {}

    static Tag create(ArgumentQueue argumentQueue, Context context) throws ParsingException {
        return Tag.selfClosingInserting(Component.newline());
    }

    @Nullable
    static Emitable claimComponent(Component component) {
        return Component.newline().equals(component) ? result -> result.selfClosingTag("br") : null;
    }
}
