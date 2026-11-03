package dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.recipe.display.slot;

import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.mapper.MappedEntity;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.PacketWrapper;

public interface SlotDisplayType<T extends SlotDisplay<?>> extends MappedEntity {

    T read(PacketWrapper<?> packetWrapper);

    void write(PacketWrapper<?> packetWrapper, T t);
}
