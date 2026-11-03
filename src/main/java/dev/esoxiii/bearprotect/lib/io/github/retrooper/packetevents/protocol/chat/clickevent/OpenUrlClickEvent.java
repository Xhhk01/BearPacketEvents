package dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.chat.clickevent;

import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.manager.server.ServerVersion;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.nbt.NBTCompound;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.nbt.NBTString;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.PacketWrapper;

import org.jspecify.annotations.NullMarked;

@NullMarked
public class OpenUrlClickEvent implements ClickEvent {

    private final String url;

    public OpenUrlClickEvent(String url) {
        this.url = url;
    }

    public static OpenUrlClickEvent decode(
            NBTCompound nBTCompound, PacketWrapper<?> packetWrapper) {
        boolean newerThanOrEquals =
                packetWrapper.getServerVersion().isNewerThanOrEquals(ServerVersion.V_1_21_5);
        String stringTagValueOrThrow =
                nBTCompound.getStringTagValueOrThrow(newerThanOrEquals ? "url" : "value");
        return new OpenUrlClickEvent(stringTagValueOrThrow);
    }

    public static void encode(
            NBTCompound nBTCompound,
            PacketWrapper<?> packetWrapper,
            OpenUrlClickEvent openUrlClickEvent) {
        boolean newerThanOrEquals =
                packetWrapper.getServerVersion().isNewerThanOrEquals(ServerVersion.V_1_21_5);
        nBTCompound.setTag(
                newerThanOrEquals ? "url" : "value", new NBTString(openUrlClickEvent.url));
    }

    @Override
    public ClickEventAction<?> getAction() {
        return ClickEventActions.OPEN_URL;
    }

    @Override
    public dev.esoxiii.bearprotect.lib.kyori.adventure.text.event.ClickEvent asAdventure() {
        return dev.esoxiii.bearprotect.lib.kyori.adventure.text.event.ClickEvent.openUrl(this.url);
    }

    public String getUrl() {
        return this.url;
    }
}
