package dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.common.server;

import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.event.PacketSendEvent;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.packettype.PacketTypeCommon;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.PacketWrapper;

public abstract class WrapperCommonServerClearDialog<T extends WrapperCommonServerClearDialog<T>>
        extends PacketWrapper<T> {

    public WrapperCommonServerClearDialog(PacketSendEvent packetSendEvent) {
        super(packetSendEvent);
    }

    public WrapperCommonServerClearDialog(PacketTypeCommon packetTypeCommon) {
        super(packetTypeCommon);
    }
}
