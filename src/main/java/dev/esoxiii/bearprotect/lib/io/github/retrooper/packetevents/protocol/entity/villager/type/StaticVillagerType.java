package dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.entity.villager.type;

import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.PacketEvents;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.manager.server.ServerVersion;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.mapper.AbstractMappedEntity;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.util.mappings.TypesBuilderData;

import org.jetbrains.annotations.ApiStatus.Internal;
import org.jetbrains.annotations.Nullable;

public class StaticVillagerType extends AbstractMappedEntity implements VillagerType {

    @Internal
    public StaticVillagerType(@Nullable TypesBuilderData typesBuilderData) {
        super(typesBuilderData);
    }

    @Override
    public int getId() {
        ServerVersion version = PacketEvents.getAPI().getServerManager().getVersion();
        return this.getId(version.toClientVersion());
    }
}
