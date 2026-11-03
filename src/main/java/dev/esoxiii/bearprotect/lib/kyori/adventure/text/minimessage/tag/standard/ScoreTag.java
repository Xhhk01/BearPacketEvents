package dev.esoxiii.bearprotect.lib.kyori.adventure.text.minimessage.tag.standard;

import dev.esoxiii.bearprotect.lib.kyori.adventure.text.Component;
import dev.esoxiii.bearprotect.lib.kyori.adventure.text.ScoreComponent;
import dev.esoxiii.bearprotect.lib.kyori.adventure.text.minimessage.Context;
import dev.esoxiii.bearprotect.lib.kyori.adventure.text.minimessage.ParsingException;
import dev.esoxiii.bearprotect.lib.kyori.adventure.text.minimessage.internal.serializer.Emitable;
import dev.esoxiii.bearprotect.lib.kyori.adventure.text.minimessage.internal.serializer.SerializableResolver;
import dev.esoxiii.bearprotect.lib.kyori.adventure.text.minimessage.tag.Tag;
import dev.esoxiii.bearprotect.lib.kyori.adventure.text.minimessage.tag.resolver.ArgumentQueue;
import dev.esoxiii.bearprotect.lib.kyori.adventure.text.minimessage.tag.resolver.TagResolver;

import org.jetbrains.annotations.Nullable;

final class ScoreTag {

    public static final String SCORE = "score";

    static final TagResolver RESOLVER =
            SerializableResolver.claimingComponent("score", ScoreTag::create, ScoreTag::emit);

    private ScoreTag() {}

    static Tag create(ArgumentQueue argumentQueue, Context context) throws ParsingException {
        String text = argumentQueue.popOr("A scoreboard member name is required").value();
        String text2 = argumentQueue.popOr("An objective name is required").value();
        return Tag.inserting(Component.score(text, text2));
    }

    @Nullable
    static Emitable emit(Component component) {
        if (!(component instanceof ScoreComponent)) {
            return null;
        }
        ScoreComponent scoreComponent = (ScoreComponent) component;
        return result ->
                result.tag("score")
                        .argument(scoreComponent.name())
                        .argument(scoreComponent.objective());
    }
}
