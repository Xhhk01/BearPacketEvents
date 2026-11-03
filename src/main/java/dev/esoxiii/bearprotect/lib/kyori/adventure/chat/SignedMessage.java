package dev.esoxiii.bearprotect.lib.kyori.adventure.chat;

import dev.esoxiii.bearprotect.lib.kyori.adventure.identity.Identified;
import dev.esoxiii.bearprotect.lib.kyori.adventure.identity.Identity;
import dev.esoxiii.bearprotect.lib.kyori.adventure.text.Component;
import dev.esoxiii.bearprotect.lib.kyori.adventure.text.ComponentLike;
import dev.esoxiii.bearprotect.lib.kyori.examination.Examinable;
import dev.esoxiii.bearprotect.lib.kyori.examination.ExaminableProperty;

import org.jetbrains.annotations.ApiStatus.NonExtendable;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.time.Instant;
import java.util.stream.Stream;

@NonExtendable
public interface SignedMessage extends Identified, Examinable {

    @Contract(value = "_ -> new", pure = true)
    @NotNull
    static SignedMessage.Signature signature(byte[] values) {
        return new SignedMessageImpl.SignatureImpl(values);
    }

    @Contract(value = "_, _ -> new", pure = true)
    @NotNull
    static SignedMessage system(@NotNull String text, @Nullable ComponentLike componentLike) {
        return new SignedMessageImpl(text, ComponentLike.unbox(componentLike));
    }

    @Contract(pure = true)
    @NotNull
    Instant timestamp();

    @Contract(pure = true)
    long salt();

    @Contract(pure = true)
    @Nullable
    SignedMessage.Signature signature();

    @Contract(pure = true)
    @Nullable
    Component unsignedContent();

    @Contract(pure = true)
    @NotNull
    String message();

    @Contract(pure = true)
    default boolean isSystem() {
        return this.identity() == Identity.nil();
    }

    @Contract(pure = true)
    default boolean canDelete() {
        return this.signature() != null;
    }

    @NotNull
    @Override
    default Stream<? extends ExaminableProperty> examinableProperties() {
        return Stream.of(
                ExaminableProperty.of("timestamp", this.timestamp()),
                ExaminableProperty.of("salt", this.salt()),
                ExaminableProperty.of("signature", this.signature()),
                ExaminableProperty.of("unsignedContent", this.unsignedContent()),
                ExaminableProperty.of("message", this.message()));
    }

    @NonExtendable
    interface Signature extends Examinable {

        @Contract(pure = true)
        byte[] bytes();

        @NotNull
        @Override
        default Stream<? extends ExaminableProperty> examinableProperties() {
            return Stream.of(ExaminableProperty.of("bytes", this.bytes()));
        }
    }
}
