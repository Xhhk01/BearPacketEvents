package dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.item.enchantment.type;

import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.component.EnchantEffectComponentTypes;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.component.IComponentMap;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.component.StaticComponentMap;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.item.enchantment.EnchantmentDefinition;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.mapper.CopyableEntity;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.mapper.DeepComparableEntity;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.mapper.MappedEntity;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.mapper.MappedEntityRefSet;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.mapper.MappedEntitySet;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.nbt.NBT;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.nbt.NBTCompound;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.player.ClientVersion;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.util.mappings.TypesBuilderData;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.PacketWrapper;
import dev.esoxiii.bearprotect.lib.kyori.adventure.text.Component;

import org.jetbrains.annotations.Nullable;
import org.jspecify.annotations.NullMarked;

import java.util.Optional;

@NullMarked
public interface EnchantmentType
        extends MappedEntity, CopyableEntity<EnchantmentType>, DeepComparableEntity {

    Component getDescription();

    EnchantmentDefinition getDefinition();

    MappedEntitySet<EnchantmentType> getExclusiveSet();

    MappedEntityRefSet<EnchantmentType> getExclusiveRefSet();

    StaticComponentMap getEffects();

    @Deprecated
    static EnchantmentType decode(
            NBT nBT, ClientVersion clientVersion, @Nullable TypesBuilderData typesBuilderData) {
        return decode(nBT, PacketWrapper.createDummyWrapper(clientVersion), typesBuilderData);
    }

    static EnchantmentType decode(
            NBT nBT, PacketWrapper<?> packetWrapper, @Nullable TypesBuilderData typesBuilderData) {
        NBTCompound nBTCompound;
        Component orThrow =
                (nBTCompound = (NBTCompound) nBT)
                        .getOrThrow("description", packetWrapper.getSerializers(), packetWrapper);
        EnchantmentDefinition enchantmentDefinition =
                EnchantmentDefinition.decode(nBTCompound, packetWrapper);
        Optional<NBT> optional = Optional.ofNullable(nBTCompound.getTagOrNull("exclusive_set"));
        MappedEntityRefSet mappedEntityRefSet =
                optional.<MappedEntityRefSet>map(
                                result ->
                                        MappedEntitySet.decodeRefSet(
                                                result, ((PacketWrapper) packetWrapper)))
                        .orElseGet(MappedEntitySet::createEmpty);
        optional = Optional.ofNullable(nBTCompound.getTagOrNull("effects"));
        StaticComponentMap staticComponentMap =
                optional.<StaticComponentMap>map(
                                result ->
                                        IComponentMap.decode(
                                                result,
                                                ((PacketWrapper) packetWrapper),
                                                EnchantEffectComponentTypes.getRegistry()))
                        .orElse(StaticComponentMap.EMPTY);
        return new StaticEnchantmentType(
                typesBuilderData,
                orThrow,
                enchantmentDefinition,
                mappedEntityRefSet,
                staticComponentMap);
    }

    @Deprecated
    static NBT encode(EnchantmentType enchantmentType, ClientVersion clientVersion) {
        return encode(enchantmentType, PacketWrapper.createDummyWrapper(clientVersion));
    }

    static NBT encode(EnchantmentType enchantmentType, PacketWrapper<?> packetWrapper) {
        NBTCompound nBTCompound;
        EnchantmentDefinition.encode(
                nBTCompound = new NBTCompound(), packetWrapper, enchantmentType.getDefinition());
        nBTCompound.set(
                "description",
                enchantmentType.getDescription(),
                packetWrapper.getSerializers(),
                packetWrapper);
        if (!enchantmentType.getExclusiveRefSet().isEmpty()) {
            nBTCompound.set(
                    "exclusive_set",
                    enchantmentType.getExclusiveRefSet(),
                    MappedEntitySet::encodeRefSet,
                    packetWrapper);
        }
        if (!enchantmentType.getEffects().isEmpty()) {
            nBTCompound.set(
                    "effects", enchantmentType.getEffects(), IComponentMap::encode, packetWrapper);
        }
        return nBTCompound;
    }
}
