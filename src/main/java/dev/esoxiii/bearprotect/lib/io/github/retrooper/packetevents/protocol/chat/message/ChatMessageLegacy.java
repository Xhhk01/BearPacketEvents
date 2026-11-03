package dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.chat.message;

import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.chat.ChatType;
import dev.esoxiii.bearprotect.lib.kyori.adventure.text.Component;

public class ChatMessageLegacy extends ChatMessage {

    public ChatMessageLegacy(Component component, ChatType chatType) {
        super(component, chatType);
    }
}
