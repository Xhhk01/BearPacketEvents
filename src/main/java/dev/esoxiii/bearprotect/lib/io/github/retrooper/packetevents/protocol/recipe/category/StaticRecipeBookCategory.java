package dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.recipe.category;

import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.mapper.AbstractMappedEntity;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.util.mappings.TypesBuilderData;

import org.jetbrains.annotations.ApiStatus.Internal;
import org.jetbrains.annotations.Nullable;

public class StaticRecipeBookCategory extends AbstractMappedEntity implements RecipeBookCategory {

    @Internal
    public StaticRecipeBookCategory(@Nullable TypesBuilderData typesBuilderData) {
        super(typesBuilderData);
    }
}
