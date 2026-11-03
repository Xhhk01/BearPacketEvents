package dev.esoxiii.bearprotect.lib.kyori.adventure.audience;

import dev.esoxiii.bearprotect.lib.kyori.adventure.resource.ResourcePackCallback;
import dev.esoxiii.bearprotect.lib.kyori.adventure.text.ComponentLike;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Consumer;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public final class Audiences {

    static final Collector<? super Audience, ?, ForwardingAudience> COLLECTOR =
            Collectors.collectingAndThen(
                    Collectors.toCollection(ArrayList::new),
                    result -> Audience.audience(Collections.unmodifiableCollection(result)));

    private Audiences() {}

    @NotNull
    public static Consumer<? super Audience> sendingMessage(@NotNull ComponentLike componentLike) {
        return result -> result.sendMessage(componentLike);
    }

    @NotNull
    static ResourcePackCallback unwrapCallback(
            Audience audience,
            Audience audience2,
            @NotNull ResourcePackCallback resourcePackCallback) {
        if (resourcePackCallback == ResourcePackCallback.noOp()) {
            return resourcePackCallback;
        }
        return (result, result2, result3) ->
                resourcePackCallback.packEventReceived(
                        result, result2, result3 == audience2 ? audience : result3);
    }
}
