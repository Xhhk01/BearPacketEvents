package dev.esoxiii.bearprotect.lib.kyori.adventure.text.minimessage.tag.standard;

import dev.esoxiii.bearprotect.lib.kyori.adventure.text.minimessage.tag.ParserDirective;
import dev.esoxiii.bearprotect.lib.kyori.adventure.text.minimessage.tag.resolver.TagResolver;

final class ResetTag {

    private static final String RESET = "reset";

    static final TagResolver RESOLVER = TagResolver.resolver("reset", ParserDirective.RESET);

    private ResetTag() {}
}
