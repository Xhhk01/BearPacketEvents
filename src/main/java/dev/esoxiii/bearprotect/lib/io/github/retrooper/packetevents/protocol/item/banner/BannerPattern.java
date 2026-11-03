package dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.item.banner;

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

import org.jspecify.annotations.NullMarked;
import org.jspecify.annotations.Nullable;

@NullMarked
public interface BannerPattern
        extends MappedEntity, CopyableEntity<BannerPattern>, DeepComparableEntity {

    ResourceLocation getAssetId();

    String getTranslationKey();

    static BannerPattern read(PacketWrapper<?> packetWrapper) {
        return packetWrapper.readMappedEntityOrDirect(
                BannerPatterns.getRegistry(), BannerPattern::readDirect);
    }

    static void write(PacketWrapper<?> packetWrapper, BannerPattern bannerPattern) {
        packetWrapper.writeMappedEntityOrDirect(bannerPattern, BannerPattern::writeDirect);
    }

    static BannerPattern readDirect(PacketWrapper<?> packetWrapper) {
        ResourceLocation resourceLocation = packetWrapper.readIdentifier();
        String text = packetWrapper.readString();
        return new StaticBannerPattern(resourceLocation, text);
    }

    static void writeDirect(PacketWrapper<?> packetWrapper, BannerPattern bannerPattern) {
        packetWrapper.writeIdentifier(bannerPattern.getAssetId());
        packetWrapper.writeString(bannerPattern.getTranslationKey());
    }

    static BannerPattern decode(
            NBT nBT, ClientVersion clientVersion, @Nullable TypesBuilderData typesBuilderData) {
        NBTCompound nBTCompound = (NBTCompound) nBT;
        ResourceLocation resourceLocation =
                new ResourceLocation(nBTCompound.getStringTagValueOrThrow("asset_id"));
        String stringTagValueOrThrow = nBTCompound.getStringTagValueOrThrow("translation_key");
        return new StaticBannerPattern(typesBuilderData, resourceLocation, stringTagValueOrThrow);
    }

    static NBT encode(BannerPattern bannerPattern, ClientVersion clientVersion) {
        NBTCompound nBTCompound;
        (nBTCompound = new NBTCompound())
                .setTag("asset_id", new NBTString(bannerPattern.getAssetId().toString()));
        nBTCompound.setTag("translation_key", new NBTString(bannerPattern.getTranslationKey()));
        return nBTCompound;
    }
}
