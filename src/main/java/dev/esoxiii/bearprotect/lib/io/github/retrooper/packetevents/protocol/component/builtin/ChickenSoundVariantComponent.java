package dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.component.builtin;

import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.entity.chicken.ChickenSoundVariant;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.entity.chicken.ChickenSoundVariants;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.PacketWrapper;

import java.util.Objects;

public class ChickenSoundVariantComponent {

    private final ChickenSoundVariant soundVariant;

    public ChickenSoundVariantComponent(ChickenSoundVariant chickenSoundVariant) {
        this.soundVariant = chickenSoundVariant;
    }

    public static ChickenSoundVariantComponent read(PacketWrapper<?> packetWrapper) {
        ChickenSoundVariant chickenSoundVariant =
                packetWrapper.readMappedEntity(ChickenSoundVariants.getRegistry());
        return new ChickenSoundVariantComponent(chickenSoundVariant);
    }

    public static void write(
            PacketWrapper<?> packetWrapper,
            ChickenSoundVariantComponent chickenSoundVariantComponent) {
        packetWrapper.writeMappedEntity(chickenSoundVariantComponent.soundVariant);
    }

    public ChickenSoundVariant getSoundVariant() {
        return this.soundVariant;
    }

    @Override
    public boolean equals(Object result) {
        if (!(result instanceof ChickenSoundVariantComponent)) {
            return false;
        }
        ChickenSoundVariantComponent chickenSoundVariantComponent =
                (ChickenSoundVariantComponent) result;
        return this.soundVariant.equals(chickenSoundVariantComponent.soundVariant);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(this.soundVariant);
    }
}
