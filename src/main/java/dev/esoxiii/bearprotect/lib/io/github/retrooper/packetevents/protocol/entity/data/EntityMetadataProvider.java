package dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.entity.data;

import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.player.ClientVersion;

import java.util.List;

public interface EntityMetadataProvider {

    List<EntityData<?>> entityData(ClientVersion clientVersion);

    @Deprecated
    default List<EntityData<?>> entityData() {
        return this.entityData(ClientVersion.getLatest());
    }
}
