package dev.esoxiii.bearprotect.lib.com.github.retrooper.packetevents.adventure.serializer.json.legacyimpl;

import dev.esoxiii.bearprotect.lib.com.github.retrooper.packetevents.adventure.serializer.json.LegacyHoverEventSerializer;

import org.jetbrains.annotations.NotNull;

public interface NBTLegacyHoverEventSerializer extends LegacyHoverEventSerializer {

    @NotNull
    static LegacyHoverEventSerializer get() {
        return NBTLegacyHoverEventSerializerImpl.INSTANCE;
    }
}
