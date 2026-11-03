package dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.server;

import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.event.PacketSendEvent;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.packettype.PacketType;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.PacketWrapper;

public class WrapperPlayServerChunkBatchBegin
        extends PacketWrapper<WrapperPlayServerChunkBatchBegin> {

    public WrapperPlayServerChunkBatchBegin(PacketSendEvent packetSendEvent) {
        super(packetSendEvent);
    }

    public WrapperPlayServerChunkBatchBegin() {
        super(PacketType.Play.Server.CHUNK_BATCH_BEGIN);
    }
}
