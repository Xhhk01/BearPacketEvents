package dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.recipe;

import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.mapper.MappedEntity;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.recipe.data.RecipeData;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.PacketWrapper;

import org.jetbrains.annotations.ApiStatus.Obsolete;

@Obsolete
public interface RecipeSerializer<T extends RecipeData> extends MappedEntity {

    @Deprecated
    RecipeType getLegacyType();

    T read(PacketWrapper<?> packetWrapper);

    void write(PacketWrapper<?> packetWrapper, T t);
}
