package dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.server;

import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.event.PacketSendEvent;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.dialog.Dialog;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.packettype.PacketType;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.common.server.WrapperCommonServerShowDialog;

public class WrapperPlayServerShowDialog
        extends WrapperCommonServerShowDialog<WrapperPlayServerShowDialog> {

    public WrapperPlayServerShowDialog(PacketSendEvent packetSendEvent) {
        super(packetSendEvent);
    }

    public WrapperPlayServerShowDialog(Dialog dialog) {
        super(PacketType.Play.Server.SHOW_DIALOG, dialog);
    }
}
