package dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.netty;

import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.netty.buffer.ByteBufAllocationOperator;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.netty.buffer.ByteBufOperator;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.netty.channel.ChannelOperator;

public interface NettyManager {

    ChannelOperator getChannelOperator();

    ByteBufOperator getByteBufOperator();

    ByteBufAllocationOperator getByteBufAllocationOperator();
}
