package dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.mapper;

import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.PacketWrapper;

import org.jetbrains.annotations.ApiStatus.Internal;
import org.jspecify.annotations.NullMarked;

@NullMarked
@Internal
public interface ResolvableEntity {

    void doResolve(PacketWrapper<?> packetWrapper);
}
