package dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.item.consumables;

import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.mapper.MappedEntity;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.PacketWrapper;

public interface ConsumeEffectType<T extends ConsumeEffect<?>> extends MappedEntity {

    T read(PacketWrapper<?> packetWrapper);

    void write(PacketWrapper<?> packetWrapper, T t);
}
