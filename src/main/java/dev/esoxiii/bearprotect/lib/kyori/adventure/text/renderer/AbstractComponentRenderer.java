package dev.esoxiii.bearprotect.lib.kyori.adventure.text.renderer;

import dev.esoxiii.bearprotect.lib.kyori.adventure.text.BlockNBTComponent;
import dev.esoxiii.bearprotect.lib.kyori.adventure.text.Component;
import dev.esoxiii.bearprotect.lib.kyori.adventure.text.EntityNBTComponent;
import dev.esoxiii.bearprotect.lib.kyori.adventure.text.KeybindComponent;
import dev.esoxiii.bearprotect.lib.kyori.adventure.text.NBTComponent;
import dev.esoxiii.bearprotect.lib.kyori.adventure.text.ScoreComponent;
import dev.esoxiii.bearprotect.lib.kyori.adventure.text.SelectorComponent;
import dev.esoxiii.bearprotect.lib.kyori.adventure.text.StorageNBTComponent;
import dev.esoxiii.bearprotect.lib.kyori.adventure.text.TextComponent;
import dev.esoxiii.bearprotect.lib.kyori.adventure.text.TranslatableComponent;
import dev.esoxiii.bearprotect.lib.kyori.adventure.text.VirtualComponent;

import org.jetbrains.annotations.NotNull;

public abstract class AbstractComponentRenderer<C> implements ComponentRenderer<C> {

    @NotNull
    @Override
    public Component render(@NotNull Component component, @NotNull C c) {
        if (component instanceof VirtualComponent) {
            component = this.renderVirtual((VirtualComponent) component, (C) c);
        }
        if (component instanceof TextComponent) {
            return this.renderText((TextComponent) component, (C) c);
        }
        if (component instanceof TranslatableComponent) {
            return this.renderTranslatable((TranslatableComponent) component, (C) c);
        }
        if (component instanceof KeybindComponent) {
            return this.renderKeybind((KeybindComponent) component, (C) c);
        }
        if (component instanceof ScoreComponent) {
            return this.renderScore((ScoreComponent) component, (C) c);
        }
        if (component instanceof SelectorComponent) {
            return this.renderSelector((SelectorComponent) component, (C) c);
        }
        if (component instanceof NBTComponent) {
            if (component instanceof BlockNBTComponent) {
                return this.renderBlockNbt((BlockNBTComponent) component, (C) c);
            }
            if (component instanceof EntityNBTComponent) {
                return this.renderEntityNbt((EntityNBTComponent) component, (C) c);
            }
            if (component instanceof StorageNBTComponent) {
                return this.renderStorageNbt((StorageNBTComponent) component, (C) c);
            }
        }
        return component;
    }

    @NotNull
    protected abstract Component renderBlockNbt(
            @NotNull BlockNBTComponent blockNBTComponent, @NotNull C c);

    @NotNull
    protected abstract Component renderEntityNbt(
            @NotNull EntityNBTComponent entityNBTComponent, @NotNull C c);

    @NotNull
    protected abstract Component renderStorageNbt(
            @NotNull StorageNBTComponent storageNBTComponent, @NotNull C c);

    @NotNull
    protected abstract Component renderKeybind(
            @NotNull KeybindComponent keybindComponent, @NotNull C c);

    @NotNull
    protected abstract Component renderScore(@NotNull ScoreComponent scoreComponent, @NotNull C c);

    @NotNull
    protected abstract Component renderSelector(
            @NotNull SelectorComponent selectorComponent, @NotNull C c);

    @NotNull
    protected abstract Component renderText(@NotNull TextComponent textComponent, @NotNull C c);

    @NotNull
    protected Component renderVirtual(@NotNull VirtualComponent virtualComponent, @NotNull C c) {
        return virtualComponent;
    }

    @NotNull
    protected abstract Component renderTranslatable(
            @NotNull TranslatableComponent translatableComponent, @NotNull C c);
}
