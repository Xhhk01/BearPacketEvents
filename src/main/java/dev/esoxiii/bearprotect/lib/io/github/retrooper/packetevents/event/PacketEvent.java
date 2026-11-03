package dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.event;

import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.PacketEvents;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.util.TimeStampMode;

import org.jspecify.annotations.NullMarked;

@NullMarked
public abstract class PacketEvent implements CallableEvent {

    private final long timestamp;

    public PacketEvent() {
        TimeStampMode timeStampMode = PacketEvents.getAPI().getSettings().getTimeStampMode();
        switch (timeStampMode) {
            case MILLIS:
                this.timestamp = System.currentTimeMillis();
                break;
            case NANO:
                this.timestamp = System.nanoTime();
                break;
            default:
                this.timestamp = 0L;
        }
    }

    public long getTimestamp() {
        return this.timestamp;
    }

    public void callPacketEventExternal(PacketListenerCommon packetListenerCommon) {
        packetListenerCommon.onPacketEventExternal(this);
    }
}
