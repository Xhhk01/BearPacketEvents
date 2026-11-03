package dev.esoxiii.bearprotect.lib.com.github.retrooper.packetevents.adventure.serializer.gson;

import dev.esoxiii.bearprotect.lib.com.github.retrooper.packetevents.adventure.option.OptionState;
import dev.esoxiii.bearprotect.lib.com.github.retrooper.packetevents.adventure.serializer.json.JSONOptions;
import dev.esoxiii.bearprotect.lib.gson.Gson;
import dev.esoxiii.bearprotect.lib.gson.TypeAdapter;
import dev.esoxiii.bearprotect.lib.gson.TypeAdapterFactory;
import dev.esoxiii.bearprotect.lib.gson.reflect.TypeToken;
import dev.esoxiii.bearprotect.lib.kyori.adventure.key.Key;
import dev.esoxiii.bearprotect.lib.kyori.adventure.text.BlockNBTComponent;
import dev.esoxiii.bearprotect.lib.kyori.adventure.text.Component;
import dev.esoxiii.bearprotect.lib.kyori.adventure.text.TranslationArgument;
import dev.esoxiii.bearprotect.lib.kyori.adventure.text.event.ClickEvent;
import dev.esoxiii.bearprotect.lib.kyori.adventure.text.event.HoverEvent;
import dev.esoxiii.bearprotect.lib.kyori.adventure.text.format.ShadowColor;
import dev.esoxiii.bearprotect.lib.kyori.adventure.text.format.Style;
import dev.esoxiii.bearprotect.lib.kyori.adventure.text.format.TextColor;
import dev.esoxiii.bearprotect.lib.kyori.adventure.text.format.TextDecoration;
import dev.esoxiii.bearprotect.lib.kyori.adventure.text.object.PlayerHeadObjectContents;

import org.jetbrains.annotations.Nullable;

import java.util.UUID;

final class SerializerFactory implements TypeAdapterFactory {

    static final Class<Key> KEY_TYPE = Key.class;

    static final Class<Component> COMPONENT_TYPE = Component.class;

    static final Class<Style> STYLE_TYPE = Style.class;

    static final Class<ClickEvent.Action> CLICK_ACTION_TYPE = ClickEvent.Action.class;

    static final Class<HoverEvent.Action> HOVER_ACTION_TYPE = HoverEvent.Action.class;

    static final Class<HoverEvent.ShowItem> SHOW_ITEM_TYPE = HoverEvent.ShowItem.class;

    static final Class<HoverEvent.ShowEntity> SHOW_ENTITY_TYPE = HoverEvent.ShowEntity.class;

    static final Class<String> STRING_TYPE = String.class;

    static final Class<TextColorWrapper> COLOR_WRAPPER_TYPE = TextColorWrapper.class;

    static final Class<TextColor> COLOR_TYPE = TextColor.class;

    static final Class<?> SHADOW_COLOR_TYPE =
            BackwardCompatUtil.IS_4_18_0_OR_NEWER ? ShadowColor.class : null;

    static final Class<TextDecoration> TEXT_DECORATION_TYPE = TextDecoration.class;

    static final Class<BlockNBTComponent.Pos> BLOCK_NBT_POS_TYPE = BlockNBTComponent.Pos.class;

    static final Class<UUID> UUID_TYPE = UUID.class;

    static final Class<?> TRANSLATION_ARGUMENT_TYPE =
            BackwardCompatUtil.IS_4_15_0_OR_NEWER ? TranslationArgument.class : null;

    static final Class<?> PROFILE_PROPERTY_TYPE =
            BackwardCompatUtil.IS_4_25_0_OR_NEWER
                    ? PlayerHeadObjectContents.ProfileProperty.class
                    : null;

    private final OptionState features;

    private final dev.esoxiii.bearprotect.lib.com.github.retrooper.packetevents.adventure.serializer.json
                    .LegacyHoverEventSerializer
            legacyHoverSerializer;

    private final BackwardCompatUtil.ShowAchievementToComponent compatShowAchievement;

    SerializerFactory(
            OptionState optionState,
            @Nullable
                    dev.esoxiii.bearprotect.lib.com.github.retrooper.packetevents.adventure.serializer.json
                                    .LegacyHoverEventSerializer
                            legacyHoverEventSerializer,
            @Nullable BackwardCompatUtil.ShowAchievementToComponent showAchievementToComponent) {
        this.features = optionState;
        this.legacyHoverSerializer = legacyHoverEventSerializer;
        this.compatShowAchievement = showAchievementToComponent;
    }

    @Override
    public <T> TypeAdapter<T> create(Gson gson2, TypeToken<T> typeToken) {
        Class<? super T> rawType = typeToken.getRawType();
        if (COMPONENT_TYPE.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) ComponentSerializerImpl.create(this.features, gson2);
        } else if (KEY_TYPE.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) KeySerializer.INSTANCE;
        } else if (STYLE_TYPE.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>)
                    StyleSerializer.create(
                            this.legacyHoverSerializer,
                            this.compatShowAchievement,
                            this.features,
                            gson2);
        } else if (CLICK_ACTION_TYPE.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) ClickEventActionSerializer.INSTANCE;
        } else if (HOVER_ACTION_TYPE.isAssignableFrom(rawType)) {
            return ((TypeAdapter<T>) HoverEventActionSerializer.INSTANCE);
        } else if (SHOW_ITEM_TYPE.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) ShowItemSerializer.create(gson2, this.features);
        } else if (SHOW_ENTITY_TYPE.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) ShowEntitySerializer.create(gson2, this.features);
        } else if (COLOR_WRAPPER_TYPE.isAssignableFrom(rawType)) {
            return ((TypeAdapter<T>) TextColorWrapper.Serializer.INSTANCE);
        } else if (COLOR_TYPE.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>)
                    (this.features.value(JSONOptions.EMIT_RGB)
                            ? TextColorSerializer.INSTANCE
                            : TextColorSerializer.DOWNSAMPLE_COLOR);
        } else if (BackwardCompatUtil.IS_4_18_0_OR_NEWER
                && SHADOW_COLOR_TYPE.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) ShadowColorSerializer.create(this.features);
        } else if (TEXT_DECORATION_TYPE.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) TextDecorationSerializer.INSTANCE;
        } else if (BLOCK_NBT_POS_TYPE.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) BlockNBTComponentPosSerializer.INSTANCE;
        } else if (UUID_TYPE.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) UUIDSerializer.uuidSerializer(this.features);
        } else if (BackwardCompatUtil.IS_4_15_0_OR_NEWER
                && TRANSLATION_ARGUMENT_TYPE.isAssignableFrom(rawType)) {
            return (TypeAdapter<T>) TranslationArgumentSerializer.create(gson2);
        } else {
            return (TypeAdapter<T>)
                    (BackwardCompatUtil.IS_4_25_0_OR_NEWER
                                    && PROFILE_PROPERTY_TYPE.isAssignableFrom(rawType)
                            ? ProfilePropertySerializer.INSTANCE
                            : null);
        }
    }
}
