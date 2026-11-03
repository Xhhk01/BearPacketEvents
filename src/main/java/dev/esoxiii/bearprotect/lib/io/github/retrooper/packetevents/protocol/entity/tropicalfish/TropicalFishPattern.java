package dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.entity.tropicalfish;

import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.mapper.MappedEntity;

public interface TropicalFishPattern extends MappedEntity {

    TropicalFishPattern.Base getBase();

    enum Base {
        SMALL,
        LARGE
    }
}
