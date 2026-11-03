package dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.component.predicates;

import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.mapper.MappedEntity;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.PacketWrapper;

public interface ComponentPredicateType<T extends IComponentPredicate> extends MappedEntity {

    T read(PacketWrapper<?> packetWrapper);

    void write(PacketWrapper<?> packetWrapper, T t);
}
