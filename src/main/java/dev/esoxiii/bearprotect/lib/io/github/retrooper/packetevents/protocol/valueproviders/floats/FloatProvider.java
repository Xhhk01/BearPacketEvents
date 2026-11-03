package dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.valueproviders.floats;

import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.nbt.NBT;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.nbt.NBTCompound;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.nbt.NBTFloat;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.nbt.NBTNumber;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.util.NbtCodec;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.util.NbtCodecException;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.util.NbtMapCodec;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.PacketWrapper;

import org.jspecify.annotations.NullMarked;

import java.util.Random;

@NullMarked
public interface FloatProvider {

    NbtMapCodec<FloatProvider> MAP_CODEC =
            new NbtMapCodec<FloatProvider>() {

                public FloatProvider decode(NBTCompound nBTCompound, PacketWrapper<?> packetWrapper)
                        throws NbtCodecException {
                    return (FloatProvider)
                            nBTCompound
                                    .getOrThrow("type", FloatProviderType.CODEC, packetWrapper)
                                    .getCodec()
                                    .decode(nBTCompound, packetWrapper);
                }

                public void encode(
                        NBTCompound nBTCompound,
                        PacketWrapper<?> packetWrapper,
                        FloatProvider floatProvider)
                        throws NbtCodecException {
                    ((NbtMapCodec<FloatProvider>) floatProvider.getType().getCodec())
                            .encode(nBTCompound, packetWrapper, floatProvider);
                    nBTCompound.set(
                            "type",
                            floatProvider.getType(),
                            FloatProviderType.CODEC,
                            packetWrapper);
                }
            };

    NbtCodec<FloatProvider> CODEC =
            new NbtCodec<FloatProvider>() {

                private final NbtCodec<FloatProvider> delegate = FloatProvider.MAP_CODEC.codec();

                public FloatProvider decode(NBT nBT, PacketWrapper<?> packetWrapper)
                        throws NbtCodecException {
                    return nBT instanceof NBTNumber
                            ? new ConstantFloat(((NBTNumber) nBT).getAsFloat())
                            : this.delegate.decode(nBT, packetWrapper);
                }

                public NBT encode(PacketWrapper<?> packetWrapper, FloatProvider floatProvider)
                        throws NbtCodecException {
                    return floatProvider instanceof ConstantFloat
                            ? new NBTFloat(((ConstantFloat) floatProvider).getValue())
                            : this.delegate.encode(packetWrapper, floatProvider);
                }
            };

    FloatProviderType<?> getType();

    float getSample(Random random);

    float getMin();

    float getMax();
}
