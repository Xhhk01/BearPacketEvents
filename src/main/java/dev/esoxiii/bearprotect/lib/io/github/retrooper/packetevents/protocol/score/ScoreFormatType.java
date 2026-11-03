package dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.score;

import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.mapper.StaticMappedEntity;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.PacketWrapper;

public interface ScoreFormatType<T extends ScoreFormat> extends StaticMappedEntity {

    @Deprecated
    @Override
    int getId();

    T read(PacketWrapper<?> packetWrapper);

    void write(PacketWrapper<?> packetWrapper, T t);
}
