package dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.entity.cat;

import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.mapper.CopyableEntity;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.mapper.DeepComparableEntity;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.mapper.MappedEntity;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.nbt.NBTCompound;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.util.NbtCodec;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.util.NbtCodecException;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.util.NbtMapCodec;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.PacketWrapper;

import org.jspecify.annotations.NullMarked;

@NullMarked
public interface CatSoundVariant
        extends MappedEntity, CopyableEntity<CatSoundVariant>, DeepComparableEntity {

    NbtCodec<CatSoundVariant> CODEC =
            (new NbtMapCodec<CatSoundVariant>() {

                        public CatSoundVariant decode(
                                NBTCompound nBTCompound, PacketWrapper<?> packetWrapper)
                                throws NbtCodecException {
                            CatSoundSet orThrow =
                                    nBTCompound.getOrThrow(
                                            "adult_sounds", CatSoundSet.CODEC, packetWrapper);
                            CatSoundSet orThrow2 =
                                    nBTCompound.getOrThrow(
                                            "baby_sounds", CatSoundSet.CODEC, packetWrapper);
                            return new StaticCatSoundVariant(orThrow, orThrow2);
                        }

                        public void encode(
                                NBTCompound nBTCompound,
                                PacketWrapper<?> packetWrapper,
                                CatSoundVariant catSoundVariant)
                                throws NbtCodecException {
                            nBTCompound.set(
                                    "adult_sounds",
                                    catSoundVariant.getAdultSounds(),
                                    CatSoundSet.CODEC,
                                    packetWrapper);
                            nBTCompound.set(
                                    "baby_sounds",
                                    catSoundVariant.getBabySounds(),
                                    CatSoundSet.CODEC,
                                    packetWrapper);
                        }
                    })
                    .codec();

    static CatSoundVariant read(PacketWrapper<?> packetWrapper) {
        return packetWrapper.readMappedEntity(CatSoundVariants.getRegistry());
    }

    static void write(PacketWrapper<?> packetWrapper, CatSoundVariant catSoundVariant) {
        packetWrapper.writeMappedEntity(catSoundVariant);
    }

    CatSoundSet getAdultSounds();

    CatSoundSet getBabySounds();
}
