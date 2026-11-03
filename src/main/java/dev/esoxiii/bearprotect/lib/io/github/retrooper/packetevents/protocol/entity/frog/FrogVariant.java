package dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.entity.frog;

import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.mapper.CopyableEntity;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.mapper.DeepComparableEntity;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.mapper.MappedEntity;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.nbt.NBT;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.nbt.NBTCompound;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.nbt.NBTString;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.player.ClientVersion;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.resources.ResourceLocation;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.util.mappings.TypesBuilderData;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.PacketWrapper;

import org.jetbrains.annotations.Nullable;
import org.jspecify.annotations.NullMarked;

@NullMarked
public interface FrogVariant
        extends MappedEntity, CopyableEntity<FrogVariant>, DeepComparableEntity {

    ResourceLocation getAssetId();

    static FrogVariant read(PacketWrapper<?> packetWrapper) {
        return packetWrapper.readMappedEntity(FrogVariants.getRegistry());
    }

    static void write(PacketWrapper<?> packetWrapper, FrogVariant frogVariant) {
        packetWrapper.writeMappedEntity(frogVariant);
    }

    static FrogVariant decode(
            NBT nBT, ClientVersion clientVersion, @Nullable TypesBuilderData typesBuilderData) {
        NBTCompound nBTCompound = (NBTCompound) nBT;
        ResourceLocation resourceLocation =
                new ResourceLocation(nBTCompound.getStringTagValueOrThrow("asset_id"));
        return new StaticFrogVariant(typesBuilderData, resourceLocation);
    }

    static NBT encode(FrogVariant frogVariant, ClientVersion clientVersion) {
        NBTCompound nBTCompound;
        (nBTCompound = new NBTCompound())
                .setTag("asset_id", new NBTString(frogVariant.getAssetId().toString()));
        return nBTCompound;
    }
}
