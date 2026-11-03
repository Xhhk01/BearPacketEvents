package dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.mapper;

import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.player.ClientVersion;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.resources.ResourceLocation;

public interface LegacyMappedEntity {

    ResourceLocation getName();

    int getLegacyId(ClientVersion clientVersion);
}
