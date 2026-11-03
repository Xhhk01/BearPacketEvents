package dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.vector.positionpath;

import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.util.Vector3d;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.PacketWrapper;

import org.jetbrains.annotations.ApiStatus.NonExtendable;
import org.jspecify.annotations.NullMarked;

@NullMarked
@NonExtendable
public interface PositionPath {

    static PositionPath read(PacketWrapper<?> packetWrapper) {
        return packetWrapper.readMappedEntity(PositionPathTypes.getRegistry()).read(packetWrapper);
    }

    static void write(PacketWrapper<?> packetWrapper, PositionPath positionPath) {
        packetWrapper.writeMappedEntity(positionPath.getType());
        ((PositionPathType<PositionPath>) positionPath.getType())
                .write(packetWrapper, positionPath);
    }

    PositionPathType<?> getType();

    Vector3d getEndPosition();
}
