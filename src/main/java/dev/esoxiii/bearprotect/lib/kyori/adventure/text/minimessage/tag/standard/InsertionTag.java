package dev.esoxiii.bearprotect.lib.kyori.adventure.text.minimessage.tag.standard;

import dev.esoxiii.bearprotect.lib.kyori.adventure.text.format.Style;
import dev.esoxiii.bearprotect.lib.kyori.adventure.text.minimessage.Context;
import dev.esoxiii.bearprotect.lib.kyori.adventure.text.minimessage.ParsingException;
import dev.esoxiii.bearprotect.lib.kyori.adventure.text.minimessage.internal.serializer.SerializableResolver;
import dev.esoxiii.bearprotect.lib.kyori.adventure.text.minimessage.internal.serializer.StyleClaim;
import dev.esoxiii.bearprotect.lib.kyori.adventure.text.minimessage.internal.serializer.TokenEmitter;
import dev.esoxiii.bearprotect.lib.kyori.adventure.text.minimessage.tag.Tag;
import dev.esoxiii.bearprotect.lib.kyori.adventure.text.minimessage.tag.resolver.ArgumentQueue;
import dev.esoxiii.bearprotect.lib.kyori.adventure.text.minimessage.tag.resolver.TagResolver;

final class InsertionTag {

    static final TagResolver RESOLVER =
            SerializableResolver.claimingStyle(
                    "insert",
                    InsertionTag::create,
                    StyleClaim.claim("insert", Style::insertion, InsertionTag::emit));

    private InsertionTag() {}

    static Tag create(ArgumentQueue argumentQueue, Context context) throws ParsingException {
        String text =
                argumentQueue
                        .popOr("A value is required to produce an insertion component")
                        .value();
        return Tag.styling(result -> result.insertion(text));
    }

    static void emit(String text, TokenEmitter tokenEmitter) {
        tokenEmitter.tag("insert").argument(text);
    }
}
