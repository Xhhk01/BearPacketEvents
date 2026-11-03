package dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.chat.clickevent;

import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.nbt.NBTCompound;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.nbt.NBTString;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.PacketWrapper;

import org.jetbrains.annotations.ApiStatus.Obsolete;
import org.jspecify.annotations.NullMarked;

@NullMarked
@Obsolete
public class TwitchUserInfoClickEvent implements ClickEvent {

    private final String value;

    public TwitchUserInfoClickEvent(String value) {
        this.value = value;
    }

    public static TwitchUserInfoClickEvent decode(
            NBTCompound nBTCompound, PacketWrapper<?> packetWrapper) {
        String stringTagValueOrThrow = nBTCompound.getStringTagValueOrThrow("value");
        return new TwitchUserInfoClickEvent(stringTagValueOrThrow);
    }

    public static void encode(
            NBTCompound nBTCompound,
            PacketWrapper<?> packetWrapper,
            TwitchUserInfoClickEvent twitchUserInfoClickEvent) {
        nBTCompound.setTag("value", new NBTString(twitchUserInfoClickEvent.value));
    }

    @Override
    public ClickEventAction<?> getAction() {
        return ClickEventActions.TWITCH_USER_INFO;
    }

    @Override
    public dev.esoxiii.bearprotect.lib.kyori.adventure.text.event.ClickEvent asAdventure() {
        throw new UnsupportedOperationException();
    }

    public String getValue() {
        return this.value;
    }
}
