package dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.chat.clickevent;

import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.mapper.AbstractMappedEntity;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.nbt.NBTCompound;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.util.NbtMapDecoder;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.util.NbtMapEncoder;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.util.mappings.TypesBuilderData;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.PacketWrapper;

import org.jetbrains.annotations.ApiStatus.Internal;
import org.jetbrains.annotations.Nullable;
import org.jspecify.annotations.NullMarked;

@NullMarked
public class StaticClickEventAction<T extends ClickEvent> extends AbstractMappedEntity
        implements ClickEventAction<T> {

    private final boolean allowFromServer;

    private final NbtMapDecoder<T> decoder;

    private final NbtMapEncoder<T> encoder;

    @Internal
    public StaticClickEventAction(
            @Nullable TypesBuilderData typesBuilderData,
            boolean allowFromServer,
            NbtMapDecoder<T> nbtMapDecoder,
            NbtMapEncoder<T> nbtMapEncoder) {
        super(typesBuilderData);
        this.allowFromServer = allowFromServer;
        this.decoder = nbtMapDecoder;
        this.encoder = nbtMapEncoder;
    }

    @Override
    public boolean isAllowFromServer() {
        return this.allowFromServer;
    }

    @Override
    public T decode(NBTCompound nBTCompound, PacketWrapper<?> packetWrapper) {
        return this.decoder.decode(nBTCompound, packetWrapper);
    }

    @Override
    public void encode(NBTCompound nBTCompound, PacketWrapper<?> packetWrapper, T t) {
        this.encoder.encode(nBTCompound, packetWrapper, (T) t);
    }
}
