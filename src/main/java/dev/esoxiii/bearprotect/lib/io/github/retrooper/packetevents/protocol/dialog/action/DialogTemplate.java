package dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.dialog.action;

import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.nbt.NBT;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.nbt.NBTString;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.PacketWrapper;

import org.jspecify.annotations.NullMarked;

@NullMarked
public class DialogTemplate {

    private final String raw;

    public DialogTemplate(String raw) {
        this.raw = raw;
    }

    public static DialogTemplate decode(NBT nBT, PacketWrapper<?> packetWrapper) {
        return new DialogTemplate(((NBTString) nBT).getValue());
    }

    public static NBT encode(PacketWrapper<?> packetWrapper, DialogTemplate dialogTemplate) {
        return new NBTString(dialogTemplate.raw);
    }

    public String getRaw() {
        return this.raw;
    }
}
