package dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.configuration.server;

import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.event.PacketSendEvent;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.packettype.PacketType;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.PacketWrapper;

public class WrapperConfigServerResetChat extends PacketWrapper<WrapperConfigServerResetChat> {

    public WrapperConfigServerResetChat(PacketSendEvent packetSendEvent) {
        super(packetSendEvent);
    }

    public WrapperConfigServerResetChat() {
        super(PacketType.Configuration.Server.RESET_CHAT);
    }
}
