package dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.chat.clickevent;

import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.manager.server.ServerVersion;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.nbt.NBTCompound;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.nbt.NBTString;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.PacketWrapper;

import org.jspecify.annotations.NullMarked;

@NullMarked
public class SuggestCommandClickEvent implements ClickEvent {

    private final String command;

    public SuggestCommandClickEvent(String command) {
        this.command = command;
    }

    public static SuggestCommandClickEvent decode(
            NBTCompound nBTCompound, PacketWrapper<?> packetWrapper) {
        boolean newerThanOrEquals =
                packetWrapper.getServerVersion().isNewerThanOrEquals(ServerVersion.V_1_21_5);
        String stringTagValueOrThrow =
                nBTCompound.getStringTagValueOrThrow(newerThanOrEquals ? "command" : "value");
        return new SuggestCommandClickEvent(stringTagValueOrThrow);
    }

    public static void encode(
            NBTCompound nBTCompound,
            PacketWrapper<?> packetWrapper,
            SuggestCommandClickEvent suggestCommandClickEvent) {
        boolean newerThanOrEquals =
                packetWrapper.getServerVersion().isNewerThanOrEquals(ServerVersion.V_1_21_5);
        nBTCompound.setTag(
                newerThanOrEquals ? "command" : "value",
                new NBTString(suggestCommandClickEvent.command));
    }

    @Override
    public ClickEventAction<?> getAction() {
        return ClickEventActions.SUGGEST_COMMAND;
    }

    @Override
    public dev.esoxiii.bearprotect.lib.kyori.adventure.text.event.ClickEvent asAdventure() {
        return dev.esoxiii.bearprotect.lib.kyori.adventure.text.event.ClickEvent.suggestCommand(this.command);
    }

    public String getCommand() {
        return this.command;
    }
}
