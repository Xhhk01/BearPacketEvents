package dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.player;

import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.util.CodecNameable;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.util.NbtCodec;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.util.NbtCodecs;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.PacketWrapper;

import org.jspecify.annotations.NullMarked;

@NullMarked
public enum PlayerModelType implements CodecNameable {
    SLIM("slim"),
    WIDE("wide");

    public static final NbtCodec<PlayerModelType> CODEC = NbtCodecs.forEnum(values());

    private final String codecName;

    PlayerModelType(String codecName) {
        this.codecName = codecName;
    }

    public static PlayerModelType read(PacketWrapper<?> packetWrapper) {
        return packetWrapper.readBoolean() ? SLIM : WIDE;
    }

    public static void write(PacketWrapper<?> packetWrapper, PlayerModelType playerModelType) {
        packetWrapper.writeBoolean(playerModelType == SLIM);
    }

    @Override
    public String getCodecName() {
        return this.codecName;
    }
}
