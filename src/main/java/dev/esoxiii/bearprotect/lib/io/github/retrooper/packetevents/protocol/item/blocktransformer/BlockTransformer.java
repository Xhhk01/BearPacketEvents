package dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.item.blocktransformer;

import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.mapper.CopyableEntity;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.mapper.DeepComparableEntity;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.mapper.MappedEntity;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.util.NbtCodec;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.PacketWrapper;

import org.jspecify.annotations.NullMarked;

import java.util.List;

@NullMarked
public interface BlockTransformer
        extends MappedEntity, CopyableEntity<BlockTransformer>, DeepComparableEntity {

    NbtCodec<BlockTransformer> DIRECT_CODEC =
            BlockTransformData.CODEC
                    .applyList()
                    .apply(
                            result -> new StaticBlockTransformer(null, result),
                            BlockTransformer::getTransforms);

    List<BlockTransformData> getTransforms();

    static BlockTransformer read(PacketWrapper<?> packetWrapper) {
        return packetWrapper.readMappedEntity(BlockTransformers.getRegistry());
    }

    static void write(PacketWrapper<?> packetWrapper, BlockTransformer blockTransformer) {
        packetWrapper.writeMappedEntity(blockTransformer);
    }
}
