package dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.item.type;

import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.PacketEvents;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.component.StaticComponentMap;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.mapper.MappedEntity;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.player.ClientVersion;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.world.states.type.StateType;

import org.jetbrains.annotations.Nullable;

import java.util.Set;

public interface ItemType extends MappedEntity {

    int getMaxAmount();

    int getMaxDurability();

    default boolean isMusicDisc() {
        return this.hasAttribute(ItemTypes.ItemAttribute.MUSIC_DISC);
    }

    ItemType getCraftRemainder();

    @Nullable
    StateType getPlacedType();

    Set<ItemTypes.ItemAttribute> getAttributes();

    default boolean hasAttribute(ItemTypes.ItemAttribute itemAttribute) {
        return this.getAttributes().contains(itemAttribute);
    }

    @Deprecated
    default StaticComponentMap getComponents() {
        return this.getComponents(
                PacketEvents.getAPI().getServerManager().getVersion().toClientVersion());
    }

    default StaticComponentMap getComponents(ClientVersion clientVersion) {
        return StaticComponentMap.EMPTY;
    }
}
