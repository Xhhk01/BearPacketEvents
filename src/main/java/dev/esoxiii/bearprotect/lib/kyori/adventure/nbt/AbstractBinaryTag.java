package dev.esoxiii.bearprotect.lib.kyori.adventure.nbt;

import dev.esoxiii.bearprotect.lib.kyori.examination.string.StringExaminer;

import org.jetbrains.annotations.NotNull;

abstract class AbstractBinaryTag implements BinaryTag {

    @NotNull
    @Override
    public final String examinableName() {
        return this.type().toString();
    }

    @Override
    public final String toString() {
        return this.examine(StringExaminer.simpleEscaping());
    }
}
