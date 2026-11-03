package dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.server;

import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.event.PacketSendEvent;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.packettype.PacketType;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.recipe.RecipeDisplayId;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.PacketWrapper;

import java.util.List;

public class WrapperPlayServerRecipeBookRemove
        extends PacketWrapper<WrapperPlayServerRecipeBookRemove> {

    private List<RecipeDisplayId> recipeIds;

    public WrapperPlayServerRecipeBookRemove(PacketSendEvent packetSendEvent) {
        super(packetSendEvent);
    }

    public WrapperPlayServerRecipeBookRemove(List<RecipeDisplayId> recipeIds) {
        super(PacketType.Play.Server.RECIPE_BOOK_REMOVE);
        this.recipeIds = recipeIds;
    }

    @Override
    public void read() {
        this.recipeIds = this.readList(RecipeDisplayId::read);
    }

    @Override
    public void write() {
        this.writeList(this.recipeIds, RecipeDisplayId::write);
    }

    public void copy(WrapperPlayServerRecipeBookRemove wrapperPlayServerRecipeBookRemove) {
        this.recipeIds = wrapperPlayServerRecipeBookRemove.recipeIds;
    }

    public List<RecipeDisplayId> getRecipeIds() {
        return this.recipeIds;
    }

    public void setRecipeIds(List<RecipeDisplayId> recipeIds) {
        this.recipeIds = recipeIds;
    }
}
