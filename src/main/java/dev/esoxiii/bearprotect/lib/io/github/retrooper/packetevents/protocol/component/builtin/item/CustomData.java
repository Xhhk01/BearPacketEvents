package dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.component.builtin.item;

import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.nbt.NBT;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.nbt.NBTCompound;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.nbt.NBTString;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.util.adventure.AdventureNbtUtil;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.PacketWrapper;

public class CustomData {

    private CustomData() {}

    public static NBTCompound read(PacketWrapper<?> packetWrapper) {
        NBT nBT;
        if ((nBT = packetWrapper.readNBTRaw()) instanceof NBTCompound) {
            return (NBTCompound) nBT;
        } else if (nBT instanceof NBTString) {
            return (NBTCompound) AdventureNbtUtil.fromString(((NBTString) nBT).getValue());
        } else {
            throw new UnsupportedOperationException("Unsupported custom data tag: " + nBT);
        }
    }

    public static void write(PacketWrapper<?> packetWrapper, NBTCompound nBTCompound) {
        packetWrapper.writeNBT(nBTCompound);
    }
}
