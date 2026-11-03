package dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.chat.clickevent;

import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.manager.server.ServerVersion;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.nbt.NBTCompound;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.nbt.NBTString;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.PacketWrapper;

import org.jspecify.annotations.NullMarked;

@NullMarked
public class OpenFileClickEvent implements ClickEvent {

    private final String path;

    public OpenFileClickEvent(String path) {
        this.path = path;
    }

    public static OpenFileClickEvent decode(
            NBTCompound nBTCompound, PacketWrapper<?> packetWrapper) {
        boolean newerThanOrEquals =
                packetWrapper.getServerVersion().isNewerThanOrEquals(ServerVersion.V_1_21_5);
        String stringTagValueOrThrow =
                nBTCompound.getStringTagValueOrThrow(newerThanOrEquals ? "path" : "value");
        return new OpenFileClickEvent(stringTagValueOrThrow);
    }

    public static void encode(
            NBTCompound nBTCompound,
            PacketWrapper<?> packetWrapper,
            OpenFileClickEvent openFileClickEvent) {
        boolean newerThanOrEquals =
                packetWrapper.getServerVersion().isNewerThanOrEquals(ServerVersion.V_1_21_5);
        nBTCompound.setTag(
                newerThanOrEquals ? "path" : "value", new NBTString(openFileClickEvent.path));
    }

    @Override
    public ClickEventAction<?> getAction() {
        return ClickEventActions.OPEN_FILE;
    }

    @Override
    public dev.esoxiii.bearprotect.lib.kyori.adventure.text.event.ClickEvent asAdventure() {
        return dev.esoxiii.bearprotect.lib.kyori.adventure.text.event.ClickEvent.openFile(this.path);
    }

    public String getPath() {
        return this.path;
    }
}
