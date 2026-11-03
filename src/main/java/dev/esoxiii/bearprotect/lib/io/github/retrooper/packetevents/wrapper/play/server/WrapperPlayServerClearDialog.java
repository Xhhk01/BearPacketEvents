package dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.server;

import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.event.PacketSendEvent;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.packettype.PacketType;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.common.server.WrapperCommonServerClearDialog;

public class WrapperPlayServerClearDialog
        extends WrapperCommonServerClearDialog<WrapperPlayServerClearDialog> {

    public WrapperPlayServerClearDialog(PacketSendEvent packetSendEvent) {
        super(packetSendEvent);
    }

    public WrapperPlayServerClearDialog() {
        super(PacketType.Play.Server.CLEAR_DIALOG);
    }
}
