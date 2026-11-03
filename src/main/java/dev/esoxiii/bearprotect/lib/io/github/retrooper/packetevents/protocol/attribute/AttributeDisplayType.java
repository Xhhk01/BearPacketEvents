package dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.attribute;

import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.mapper.MappedEntity;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.PacketWrapper;

import org.jspecify.annotations.NullMarked;

@NullMarked
public interface AttributeDisplayType<T extends AttributeDisplay> extends MappedEntity {

    T read(PacketWrapper<?> packetWrapper);

    void write(PacketWrapper<?> packetWrapper, T t);
}
