package dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.dialog.body;

import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.nbt.NBT;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.nbt.NBTCompound;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.nbt.NBTInt;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.util.adventure.AdventureSerializer;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.PacketWrapper;
import dev.esoxiii.bearprotect.lib.kyori.adventure.text.Component;

import org.jspecify.annotations.NullMarked;

@NullMarked
public class PlainMessage {

    private final Component contents;

    private final int width;

    public PlainMessage(Component component, int width) {
        this.contents = component;
        this.width = width;
    }

    public static PlainMessage decode(NBT nBT, PacketWrapper<?> packetWrapper) {
        return decode((NBTCompound) nBT, packetWrapper);
    }

    public static PlainMessage decode(NBTCompound nBTCompound, PacketWrapper<?> packetWrapper) {
        Component orThrow =
                nBTCompound.getOrThrow(
                        "contents", AdventureSerializer.serializer(packetWrapper), packetWrapper);
        int value = nBTCompound.getNumberTagValueOrDefault("width", 200).intValue();
        return new PlainMessage(orThrow, value);
    }

    public static NBT encode(PacketWrapper<?> packetWrapper, PlainMessage plainMessage) {
        NBTCompound nBTCompound;
        encode(nBTCompound = new NBTCompound(), packetWrapper, plainMessage);
        return nBTCompound;
    }

    public static void encode(
            NBTCompound nBTCompound, PacketWrapper<?> packetWrapper, PlainMessage plainMessage) {
        nBTCompound.set(
                "contents",
                plainMessage.contents,
                AdventureSerializer.serializer(packetWrapper),
                packetWrapper);
        if (plainMessage.width != 200) {
            nBTCompound.setTag("width", new NBTInt(plainMessage.width));
        }
    }

    public Component getContents() {
        return this.contents;
    }

    public int getWidth() {
        return this.width;
    }
}
