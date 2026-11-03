package dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.chat.message.reader.impl;

import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.chat.ChatType;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.chat.ChatTypes;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.chat.message.ChatMessage;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.chat.message.ChatMessageLegacy;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.chat.message.reader.ChatMessageProcessor;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.PacketWrapper;
import dev.esoxiii.bearprotect.lib.kyori.adventure.text.Component;

import org.jetbrains.annotations.NotNull;

public class ChatMessageProcessorLegacy implements ChatMessageProcessor {

    @Override
    public ChatMessage readChatMessage(@NotNull PacketWrapper<?> packetWrapper) {
        Component component = packetWrapper.readComponent();
        ChatType chatType = packetWrapper.readMappedEntity(ChatTypes.getRegistry());
        return new ChatMessageLegacy(component, chatType);
    }

    @Override
    public void writeChatMessage(
            @NotNull PacketWrapper<?> packetWrapper, @NotNull ChatMessage chatMessage) {
        packetWrapper.writeComponent(chatMessage.getChatContent());
        packetWrapper.writeMappedEntity(chatMessage.getType());
    }
}
