package dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.configuration.server;

import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.event.PacketSendEvent;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.packettype.PacketType;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.common.server.WrapperCommonServerClearDialog;

public class WrapperConfigServerClearDialog
        extends WrapperCommonServerClearDialog<WrapperConfigServerClearDialog> {

    public WrapperConfigServerClearDialog(PacketSendEvent packetSendEvent) {
        super(packetSendEvent);
    }

    public WrapperConfigServerClearDialog() {
        super(PacketType.Configuration.Server.CLEAR_DIALOG);
    }
}
