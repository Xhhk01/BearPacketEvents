package dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.entity.fox;

import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.mapper.AbstractMappedEntity;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.util.mappings.TypesBuilderData;

import org.jetbrains.annotations.ApiStatus.Internal;
import org.jetbrains.annotations.Nullable;

public class StaticFoxVariant extends AbstractMappedEntity implements FoxVariant {

    @Internal
    public StaticFoxVariant(@Nullable TypesBuilderData typesBuilderData) {
        super(typesBuilderData);
    }
}
