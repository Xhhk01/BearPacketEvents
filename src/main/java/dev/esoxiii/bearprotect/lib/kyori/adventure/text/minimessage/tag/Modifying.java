package dev.esoxiii.bearprotect.lib.kyori.adventure.text.minimessage.tag;

import dev.esoxiii.bearprotect.lib.kyori.adventure.text.Component;
import dev.esoxiii.bearprotect.lib.kyori.adventure.text.minimessage.tree.Node;

import org.jetbrains.annotations.ApiStatus.OverrideOnly;
import org.jetbrains.annotations.NotNull;

@OverrideOnly
public interface Modifying extends Tag {

    default void visit(@NotNull Node node, int value) {}

    default void postVisit() {}

    Component apply(@NotNull Component component, int value);
}
