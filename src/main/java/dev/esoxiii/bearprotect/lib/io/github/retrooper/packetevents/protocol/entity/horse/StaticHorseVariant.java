package dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.entity.horse;

import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.mapper.AbstractMappedEntity;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.util.mappings.TypesBuilderData;

import org.jetbrains.annotations.ApiStatus.Internal;
import org.jetbrains.annotations.Nullable;

public class StaticHorseVariant extends AbstractMappedEntity implements HorseVariant {

    @Internal
    public StaticHorseVariant(@Nullable TypesBuilderData typesBuilderData) {
        super(typesBuilderData);
    }
}
