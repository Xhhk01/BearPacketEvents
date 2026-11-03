package dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.world.blockentity;

import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.mapper.AbstractMappedEntity;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.util.mappings.TypesBuilderData;

import org.jetbrains.annotations.ApiStatus.Internal;
import org.jetbrains.annotations.Nullable;

public class StaticBlockEntityType extends AbstractMappedEntity implements BlockEntityType {

    @Internal
    public StaticBlockEntityType(@Nullable TypesBuilderData typesBuilderData) {
        super(typesBuilderData);
    }
}
