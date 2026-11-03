package dev.esoxiii.bearprotect.lib.kyori.adventure.text.event;

import dev.esoxiii.bearprotect.lib.kyori.adventure.nbt.api.BinaryTagHolder;
import dev.esoxiii.bearprotect.lib.kyori.examination.Examinable;

import org.jetbrains.annotations.NotNull;

public interface DataComponentValue extends Examinable {

    static DataComponentValue.@NotNull Removed removed() {
        return RemovedDataComponentValueImpl.REMOVED;
    }

    interface Removed extends DataComponentValue {}

    interface TagSerializable extends DataComponentValue {

        @NotNull
        BinaryTagHolder asBinaryTag();
    }
}
