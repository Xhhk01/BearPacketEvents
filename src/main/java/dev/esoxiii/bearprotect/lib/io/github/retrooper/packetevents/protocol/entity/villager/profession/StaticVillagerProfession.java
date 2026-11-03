package dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.entity.villager.profession;

import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.PacketEvents;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.manager.server.ServerVersion;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.mapper.AbstractMappedEntity;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.util.mappings.TypesBuilderData;

import org.jetbrains.annotations.ApiStatus.Internal;
import org.jetbrains.annotations.Nullable;

public class StaticVillagerProfession extends AbstractMappedEntity implements VillagerProfession {

    @Internal
    public StaticVillagerProfession(@Nullable TypesBuilderData typesBuilderData) {
        super(typesBuilderData);
    }

    @Override
    public int getId() {
        ServerVersion version = PacketEvents.getAPI().getServerManager().getVersion();
        return this.getId(version.toClientVersion());
    }
}
