package dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.packettype;

import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.player.ClientVersion;

public interface PacketTypeConstant extends PacketTypeCommon {

    @Override
    default int getId(ClientVersion clientVersion) {
        return this.getId();
    }

    int getId();
}
