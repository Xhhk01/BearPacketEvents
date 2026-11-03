package dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.entity.cow;

import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.mapper.CopyableEntity;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.mapper.DeepComparableEntity;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.mapper.MappedEntity;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.util.NbtCodec;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.PacketWrapper;

import org.jspecify.annotations.NullMarked;

@NullMarked
public interface CowSoundVariant
        extends MappedEntity, CopyableEntity<CowSoundVariant>, DeepComparableEntity {

    NbtCodec<CowSoundVariant> CODEC =
            CowSoundSet.CODEC.apply(StaticCowSoundVariant::new, CowSoundVariant::getSounds);

    static CowSoundVariant read(PacketWrapper<?> packetWrapper) {
        return packetWrapper.readMappedEntity(CowSoundVariants.getRegistry());
    }

    static void write(PacketWrapper<?> packetWrapper, CowSoundVariant cowSoundVariant) {
        packetWrapper.writeMappedEntity(cowSoundVariant);
    }

    CowSoundSet getSounds();
}
