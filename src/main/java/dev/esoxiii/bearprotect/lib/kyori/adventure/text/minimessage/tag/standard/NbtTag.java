package dev.esoxiii.bearprotect.lib.kyori.adventure.text.minimessage.tag.standard;

import dev.esoxiii.bearprotect.lib.kyori.adventure.key.Key;
import dev.esoxiii.bearprotect.lib.kyori.adventure.text.BlockNBTComponent;
import dev.esoxiii.bearprotect.lib.kyori.adventure.text.Component;
import dev.esoxiii.bearprotect.lib.kyori.adventure.text.EntityNBTComponent;
import dev.esoxiii.bearprotect.lib.kyori.adventure.text.NBTComponent;
import dev.esoxiii.bearprotect.lib.kyori.adventure.text.NBTComponentBuilder;
import dev.esoxiii.bearprotect.lib.kyori.adventure.text.StorageNBTComponent;
import dev.esoxiii.bearprotect.lib.kyori.adventure.text.minimessage.Context;
import dev.esoxiii.bearprotect.lib.kyori.adventure.text.minimessage.ParsingException;
import dev.esoxiii.bearprotect.lib.kyori.adventure.text.minimessage.internal.serializer.Emitable;
import dev.esoxiii.bearprotect.lib.kyori.adventure.text.minimessage.internal.serializer.SerializableResolver;
import dev.esoxiii.bearprotect.lib.kyori.adventure.text.minimessage.tag.Tag;
import dev.esoxiii.bearprotect.lib.kyori.adventure.text.minimessage.tag.resolver.ArgumentQueue;
import dev.esoxiii.bearprotect.lib.kyori.adventure.text.minimessage.tag.resolver.TagResolver;

import org.jetbrains.annotations.Nullable;

final class NbtTag {

    static final TagResolver RESOLVER =
            SerializableResolver.claimingComponent(
                    StandardTags.names("nbt", "data"), NbtTag::resolve, NbtTag::emit);

    private NbtTag() {}

    static Tag resolve(ArgumentQueue argumentQueue, Context context) throws ParsingException {
        String text =
                argumentQueue.popOr("a type of block, entity, or storage is required").lowerValue();
        NBTComponentBuilder nBTComponentBuilder;
        if ("block".equals(text)) {
            String text2 = argumentQueue.popOr("A position is required").value();
            try {
                nBTComponentBuilder =
                        Component.blockNBT().pos(BlockNBTComponent.Pos.fromString(text2));
            } catch (IllegalArgumentException illegalArgumentException) {
                throw context.newException(illegalArgumentException.getMessage(), argumentQueue);
            }
        } else if ("entity".equals(text)) {
            nBTComponentBuilder =
                    Component.entityNBT()
                            .selector(argumentQueue.popOr("A selector is required").value());
        } else {
            if (!"storage".equals(text)) {
                throw context.newException("Unknown nbt tag type '" + text + "'", argumentQueue);
            }
            nBTComponentBuilder =
                    Component.storageNBT()
                            .storage(
                                    Key.key(
                                            argumentQueue
                                                    .popOr("A storage key is required")
                                                    .value()));
        }
        nBTComponentBuilder.nbtPath(argumentQueue.popOr("An NBT path is required").value());
        if (argumentQueue.hasNext()) {
            String text3 = argumentQueue.pop().value();
            if ("interpret".equalsIgnoreCase(text3)) {
                nBTComponentBuilder.interpret(true);
            } else {
                nBTComponentBuilder.separator(context.deserialize(text3));
                if (argumentQueue.hasNext()
                        && argumentQueue.pop().value().equalsIgnoreCase("interpret")) {
                    nBTComponentBuilder.interpret(true);
                }
            }
        }
        return Tag.inserting(nBTComponentBuilder.build());
    }

    @Nullable
    static Emitable emit(Component component) {
        String text;
        String text2;
        if (component instanceof BlockNBTComponent) {
            text = "block";
            text2 = ((BlockNBTComponent) component).pos().asString();
        } else if (component instanceof EntityNBTComponent) {
            text = "entity";
            text2 = ((EntityNBTComponent) component).selector();
        } else {
            if (!(component instanceof StorageNBTComponent)) {
                return null;
            }
            text = "storage";
            text2 = ((StorageNBTComponent) component).storage().asString();
        }
        String text3 = text2;
        String text4 = text;
        return result -> {
            NBTComponent nBTComponent = (NBTComponent) component;
            result.tag("nbt").argument(text4).argument(text3).argument(nBTComponent.nbtPath());
            if (nBTComponent.separator() != null) {
                result.argument(nBTComponent.separator());
            }
            if (nBTComponent.interpret()) {
                result.argument("interpret");
            }
        };
    }
}
