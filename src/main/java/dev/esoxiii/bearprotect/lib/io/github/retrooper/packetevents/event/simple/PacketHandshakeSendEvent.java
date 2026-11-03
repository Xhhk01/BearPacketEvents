package dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.event.simple;

import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.event.PacketSendEvent;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.exception.PacketProcessException;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.manager.server.ServerVersion;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.netty.buffer.ByteBufHelper;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.ConnectionState;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.packettype.PacketType;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.packettype.PacketTypeCommon;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.player.User;

import org.jetbrains.annotations.UnknownNullability;
import org.jspecify.annotations.NullMarked;

@NullMarked
public class PacketHandshakeSendEvent extends PacketSendEvent {

    public PacketHandshakeSendEvent(
            Object result,
            User user,
            @UnknownNullability Object result2,
            Object result3,
            boolean matches)
            throws PacketProcessException {
        this(result, user, result2, result3, matches, user.getEncoderState());
    }

    public PacketHandshakeSendEvent(
            Object result,
            User user,
            @UnknownNullability Object result2,
            Object result3,
            boolean matches,
            ConnectionState connectionState)
            throws PacketProcessException {
        super(result, user, result2, result3, matches, connectionState);
    }

    protected PacketHandshakeSendEvent(
            int value,
            PacketTypeCommon packetTypeCommon,
            ServerVersion serverVersion,
            Object result,
            User user,
            @UnknownNullability Object result2,
            Object result3)
            throws PacketProcessException {
        super(value, packetTypeCommon, serverVersion, result, user, result2, result3);
    }

    public PacketHandshakeSendEvent clone() {
        Object result = ByteBufHelper.retainedDuplicate(this.getByteBuf());
        return new PacketHandshakeSendEvent(
                this.getPacketId(),
                this.getPacketType(),
                this.getServerVersion(),
                this.getChannel(),
                this.getUser(),
                this.getPlayer(),
                result);
    }

    public PacketType.Handshaking.Client getPacketType() {
        return (PacketType.Handshaking.Client) super.getPacketType();
    }
}
