package dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.entity.cat;

import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.manager.server.ServerVersion;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.mapper.CopyableEntity;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.mapper.DeepComparableEntity;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.mapper.MappedEntity;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.nbt.NBT;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.nbt.NBTCompound;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.player.ClientVersion;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.util.NbtCodec;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.util.NbtCodecException;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.util.NbtMapCodec;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.resources.ResourceLocation;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.util.mappings.TypesBuilderData;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.PacketWrapper;

import org.jspecify.annotations.NullMarked;
import org.jspecify.annotations.Nullable;

@NullMarked
public interface CatVariant extends MappedEntity, CopyableEntity<CatVariant>, DeepComparableEntity {

    NbtCodec<CatVariant> CODEC =
            (new NbtMapCodec<CatVariant>() {

                        public CatVariant decode(
                                NBTCompound nBTCompound, PacketWrapper<?> packetWrapper)
                                throws NbtCodecException {
                            ResourceLocation orThrow =
                                    nBTCompound.getOrThrow(
                                            "asset_id", ResourceLocation.CODEC, packetWrapper);
                            ResourceLocation resourceLocation =
                                    packetWrapper
                                                    .getServerVersion()
                                                    .isOlderThan(ServerVersion.V_26_1)
                                            ? orThrow
                                            : nBTCompound.getOrThrow(
                                                    "baby_asset_id",
                                                    ResourceLocation.CODEC,
                                                    packetWrapper);
                            return new StaticCatVariant(orThrow, resourceLocation);
                        }

                        public void encode(
                                NBTCompound nBTCompound,
                                PacketWrapper<?> packetWrapper,
                                CatVariant catVariant)
                                throws NbtCodecException {
                            nBTCompound.set(
                                    "asset_id",
                                    catVariant.getAssetId(),
                                    ResourceLocation.CODEC,
                                    packetWrapper);
                            if (packetWrapper
                                    .getServerVersion()
                                    .isNewerThan(ServerVersion.V_26_1)) {
                                nBTCompound.set(
                                        "baby_asset_id",
                                        catVariant.getBabyAssetId(),
                                        ResourceLocation.CODEC,
                                        packetWrapper);
                            }
                        }
                    })
                    .codec();

    ResourceLocation getAssetId();

    ResourceLocation getBabyAssetId();

    static CatVariant read(PacketWrapper<?> packetWrapper) {
        return packetWrapper.readMappedEntity(CatVariants.getRegistry());
    }

    static void write(PacketWrapper<?> packetWrapper, CatVariant catVariant) {
        packetWrapper.writeMappedEntity(catVariant);
    }

    @Deprecated
    static CatVariant decode(
            NBT nBT, ClientVersion clientVersion, @Nullable TypesBuilderData typesBuilderData) {
        return CODEC.decode(nBT, PacketWrapper.createDummyWrapper(clientVersion))
                .copy(typesBuilderData);
    }

    @Deprecated
    static NBT encode(CatVariant catVariant, ClientVersion clientVersion) {
        return CODEC.encode(PacketWrapper.createDummyWrapper(clientVersion), catVariant);
    }
}
