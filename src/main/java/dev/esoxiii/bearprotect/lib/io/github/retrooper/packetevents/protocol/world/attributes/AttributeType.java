package dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.world.attributes;

import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.mapper.MappedEntity;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.util.NbtCodec;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.world.attributes.modifiers.AttributeModifier;

import org.jspecify.annotations.NullMarked;

@NullMarked
public interface AttributeType<T> extends MappedEntity {

    boolean isSynced();

    NbtCodec<T> getValueCodec();

    NbtCodec<AttributeModifier<T, ?>> getModifierCodec();
}
