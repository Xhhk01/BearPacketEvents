package dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.chat.message.reader;

import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.chat.message.ChatMessage;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.PacketWrapper;

import org.jetbrains.annotations.NotNull;

public interface ChatMessageProcessor {

    ChatMessage readChatMessage(@NotNull PacketWrapper<?> packetWrapper);

    void writeChatMessage(
            @NotNull PacketWrapper<?> packetWrapper, @NotNull ChatMessage chatMessage);
}
