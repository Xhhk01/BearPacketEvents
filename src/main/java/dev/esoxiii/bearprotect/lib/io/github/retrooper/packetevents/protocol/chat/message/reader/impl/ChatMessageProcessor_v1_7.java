package dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.chat.message.reader.impl;

import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.chat.ChatTypes;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.chat.message.ChatMessage;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.chat.message.ChatMessageLegacy;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.chat.message.reader.ChatMessageProcessor;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.PacketWrapper;
import dev.esoxiii.bearprotect.lib.kyori.adventure.text.Component;

import org.jetbrains.annotations.NotNull;

public class ChatMessageProcessor_v1_7 implements ChatMessageProcessor {

    @Override
    public ChatMessage readChatMessage(@NotNull PacketWrapper<?> packetWrapper) {
        Component component = packetWrapper.readComponent();
        return new ChatMessageLegacy(component, ChatTypes.CHAT);
    }

    @Override
    public void writeChatMessage(
            @NotNull PacketWrapper<?> packetWrapper, @NotNull ChatMessage chatMessage) {
        packetWrapper.writeComponent(chatMessage.getChatContent());
    }
}
