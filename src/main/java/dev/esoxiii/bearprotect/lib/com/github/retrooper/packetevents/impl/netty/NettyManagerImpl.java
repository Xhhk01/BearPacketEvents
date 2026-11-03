package dev.esoxiii.bearprotect.lib.com.github.retrooper.packetevents.impl.netty;

import dev.esoxiii.bearprotect.lib.com.github.retrooper.packetevents.impl.netty.buffer.ByteBufAllocationOperatorImpl;
import dev.esoxiii.bearprotect.lib.com.github.retrooper.packetevents.impl.netty.buffer.ByteBufOperatorImpl;
import dev.esoxiii.bearprotect.lib.com.github.retrooper.packetevents.impl.netty.channel.ChannelOperatorImpl;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.netty.NettyManager;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.netty.buffer.ByteBufAllocationOperator;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.netty.buffer.ByteBufOperator;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.netty.channel.ChannelOperator;

public class NettyManagerImpl implements NettyManager {

    private static final ByteBufOperator BYTE_BUF_OPERATOR = new ByteBufOperatorImpl();

    private static final ByteBufAllocationOperator BYTE_BUF_ALLOCATION_OPERATOR =
            new ByteBufAllocationOperatorImpl();

    private static final ChannelOperator CHANNEL_OPERATOR = new ChannelOperatorImpl();

    @Override
    public ChannelOperator getChannelOperator() {
        return CHANNEL_OPERATOR;
    }

    @Override
    public ByteBufOperator getByteBufOperator() {
        return BYTE_BUF_OPERATOR;
    }

    @Override
    public ByteBufAllocationOperator getByteBufAllocationOperator() {
        return BYTE_BUF_ALLOCATION_OPERATOR;
    }
}
