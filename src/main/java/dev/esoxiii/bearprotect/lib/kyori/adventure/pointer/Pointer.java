package dev.esoxiii.bearprotect.lib.kyori.adventure.pointer;

import dev.esoxiii.bearprotect.lib.kyori.adventure.key.Key;
import dev.esoxiii.bearprotect.lib.kyori.examination.Examinable;
import dev.esoxiii.bearprotect.lib.kyori.examination.ExaminableProperty;

import org.jetbrains.annotations.ApiStatus.NonExtendable;
import org.jetbrains.annotations.NotNull;

import java.util.stream.Stream;

@NonExtendable
public interface Pointer<V> extends Examinable {

    @NotNull
    static <V> Pointer<V> pointer(@NotNull Class<V> classValue, @NotNull Key key) {
        return new PointerImpl<>(classValue, key);
    }

    @NotNull
    Class<V> type();

    @NotNull
    Key key();

    @NotNull
    @Override
    default Stream<? extends ExaminableProperty> examinableProperties() {
        return Stream.of(
                ExaminableProperty.of("type", this.type()),
                ExaminableProperty.of("key", this.key()));
    }
}
