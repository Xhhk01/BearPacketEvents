package dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.server;

import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.event.PacketSendEvent;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.item.ItemStack;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.packettype.PacketType;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.PacketWrapper;

public class WrapperPlayServerSetCursorItem extends PacketWrapper<WrapperPlayServerSetCursorItem> {

    private ItemStack stack;

    public WrapperPlayServerSetCursorItem(PacketSendEvent packetSendEvent) {
        super(packetSendEvent);
    }

    public WrapperPlayServerSetCursorItem(ItemStack itemStack) {
        super(PacketType.Play.Server.SET_CURSOR_ITEM);
        this.stack = itemStack;
    }

    @Override
    public void read() {
        this.stack = this.readItemStack();
    }

    @Override
    public void write() {
        this.writeItemStack(this.stack);
    }

    public void copy(WrapperPlayServerSetCursorItem wrapperPlayServerSetCursorItem) {
        this.stack = wrapperPlayServerSetCursorItem.stack;
    }

    public ItemStack getStack() {
        return this.stack;
    }

    public void setStack(ItemStack itemStack) {
        this.stack = itemStack;
    }
}
