package dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.event;

import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.event.simple.PacketConfigReceiveEvent;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.event.simple.PacketConfigSendEvent;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.event.simple.PacketHandshakeReceiveEvent;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.event.simple.PacketLoginReceiveEvent;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.event.simple.PacketLoginSendEvent;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.event.simple.PacketPlayReceiveEvent;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.event.simple.PacketPlaySendEvent;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.event.simple.PacketStatusReceiveEvent;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.event.simple.PacketStatusSendEvent;

public abstract class SimplePacketListenerAbstract extends PacketListenerCommon {

    public SimplePacketListenerAbstract(PacketListenerPriority packetListenerPriority) {
        super(packetListenerPriority);
    }

    public SimplePacketListenerAbstract() {}

    @Override
    void onPacketReceive(PacketReceiveEvent packetReceiveEvent) {
        if (packetReceiveEvent instanceof PacketHandshakeReceiveEvent) {
            this.onPacketHandshakeReceive((PacketHandshakeReceiveEvent) packetReceiveEvent);
        } else if (packetReceiveEvent instanceof PacketStatusReceiveEvent) {
            this.onPacketStatusReceive((PacketStatusReceiveEvent) packetReceiveEvent);
        } else if (packetReceiveEvent instanceof PacketLoginReceiveEvent) {
            this.onPacketLoginReceive((PacketLoginReceiveEvent) packetReceiveEvent);
        } else if (packetReceiveEvent instanceof PacketConfigReceiveEvent) {
            this.onPacketConfigReceive((PacketConfigReceiveEvent) packetReceiveEvent);
        } else if (packetReceiveEvent instanceof PacketPlayReceiveEvent) {
            this.onPacketPlayReceive((PacketPlayReceiveEvent) packetReceiveEvent);
        }
    }

    @Override
    void onPacketSend(PacketSendEvent packetSendEvent) {
        if (packetSendEvent instanceof PacketStatusSendEvent) {
            this.onPacketStatusSend((PacketStatusSendEvent) packetSendEvent);
        } else if (packetSendEvent instanceof PacketLoginSendEvent) {
            this.onPacketLoginSend((PacketLoginSendEvent) packetSendEvent);
        } else if (packetSendEvent instanceof PacketConfigSendEvent) {
            this.onPacketConfigSend((PacketConfigSendEvent) packetSendEvent);
        } else if (packetSendEvent instanceof PacketPlaySendEvent) {
            this.onPacketPlaySend((PacketPlaySendEvent) packetSendEvent);
        }
    }

    public void onPacketHandshakeReceive(PacketHandshakeReceiveEvent packetHandshakeReceiveEvent) {}

    public void onPacketStatusReceive(PacketStatusReceiveEvent packetStatusReceiveEvent) {}

    public void onPacketStatusSend(PacketStatusSendEvent packetStatusSendEvent) {}

    public void onPacketLoginReceive(PacketLoginReceiveEvent packetLoginReceiveEvent) {}

    public void onPacketLoginSend(PacketLoginSendEvent packetLoginSendEvent) {}

    public void onPacketConfigReceive(PacketConfigReceiveEvent packetConfigReceiveEvent) {}

    public void onPacketConfigSend(PacketConfigSendEvent packetConfigSendEvent) {}

    public void onPacketPlayReceive(PacketPlayReceiveEvent packetPlayReceiveEvent) {}

    public void onPacketPlaySend(PacketPlaySendEvent packetPlaySendEvent) {}
}
