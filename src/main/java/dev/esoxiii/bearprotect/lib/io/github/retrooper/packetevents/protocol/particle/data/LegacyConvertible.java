package dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.particle.data;

import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.player.ClientVersion;

public interface LegacyConvertible {

    LegacyParticleData toLegacy(ClientVersion clientVersion);
}
