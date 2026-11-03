package dev.esoxiii.bearprotect.lib.kyori.adventure.text.minimessage.tag.resolver;

import dev.esoxiii.bearprotect.lib.kyori.adventure.text.minimessage.tag.Tag;

import org.jetbrains.annotations.NotNull;

import java.util.Map;

interface MappableResolver {

    boolean contributeToMap(@NotNull Map<String, Tag> entries);
}
