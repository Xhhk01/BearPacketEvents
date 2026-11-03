package dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.server;

import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.event.PacketSendEvent;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.packettype.PacketType;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.PacketWrapper;

import org.jspecify.annotations.NullMarked;

@NullMarked
public class WrapperPlayServerLowDiskSpaceWarning
        extends PacketWrapper<WrapperPlayServerLowDiskSpaceWarning> {

    public WrapperPlayServerLowDiskSpaceWarning(PacketSendEvent packetSendEvent) {
        super(packetSendEvent);
    }

    public WrapperPlayServerLowDiskSpaceWarning() {
        super(PacketType.Play.Server.LOW_DISK_SPACE_WARNING);
    }
}
