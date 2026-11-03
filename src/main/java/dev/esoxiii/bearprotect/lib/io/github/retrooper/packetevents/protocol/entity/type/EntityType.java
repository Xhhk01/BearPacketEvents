package dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.entity.type;

import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.mapper.LegacyMappedEntity;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.mapper.MappedEntity;

import java.util.Optional;

public interface EntityType extends MappedEntity, LegacyMappedEntity {

    boolean isInstanceOf(EntityType entityType);

    Optional<EntityType> getParent();
}
