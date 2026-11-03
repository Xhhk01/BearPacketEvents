package dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.mapper;

import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.player.ClientVersion;

public interface StaticMappedEntity extends MappedEntity {

    int getId();

    @Override
    default int getId(ClientVersion clientVersion) {
        return this.getId();
    }
}
