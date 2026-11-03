package dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.login.client;

import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.event.PacketReceiveEvent;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.netty.buffer.ByteBufHelper;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.packettype.PacketType;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.player.ClientVersion;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.PacketWrapper;

public class WrapperLoginClientPluginResponse
        extends PacketWrapper<WrapperLoginClientPluginResponse> {

    private int messageID;

    private boolean successful;

    private byte[] data;

    public WrapperLoginClientPluginResponse(PacketReceiveEvent packetReceiveEvent) {
        super(packetReceiveEvent);
    }

    public WrapperLoginClientPluginResponse(
            ClientVersion clientVersion, int messageID, boolean successful, byte[] data) {
        super(PacketType.Login.Client.LOGIN_PLUGIN_RESPONSE.getId(), clientVersion);
        this.messageID = messageID;
        this.successful = successful;
        this.data = data;
    }

    @Override
    public void read() {
        this.messageID = this.readVarInt();
        this.successful = this.readBoolean();
        if (this.successful) {
            this.data = this.readBytes(ByteBufHelper.readableBytes(this.buffer));
        } else {
            this.data = new byte[0];
        }
    }

    @Override
    public void write() {
        this.writeVarInt(this.messageID);
        this.writeBoolean(this.successful);
        if (this.successful) {
            this.writeBytes(this.data);
        }
    }

    public void copy(WrapperLoginClientPluginResponse wrapperLoginClientPluginResponse) {
        this.messageID = wrapperLoginClientPluginResponse.messageID;
        this.successful = wrapperLoginClientPluginResponse.successful;
        this.data = wrapperLoginClientPluginResponse.data;
    }

    public int getMessageId() {
        return this.messageID;
    }

    public void setMessageId(int messageID) {
        this.messageID = messageID;
    }

    public boolean isSuccessful() {
        return this.successful;
    }

    public void setSuccessful(boolean successful) {
        this.successful = successful;
    }

    public byte[] getData() {
        return this.data;
    }

    public void setData(byte[] data) {
        this.data = data;
    }
}
