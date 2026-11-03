package dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.server;

import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.event.PacketSendEvent;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.packettype.PacketType;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.PacketWrapper;

public class WrapperPlayServerUpdateSimulationDistance
        extends PacketWrapper<WrapperPlayServerUpdateSimulationDistance> {

    private int simulationDistance;

    public WrapperPlayServerUpdateSimulationDistance(PacketSendEvent packetSendEvent) {
        super(packetSendEvent);
    }

    public WrapperPlayServerUpdateSimulationDistance(int simulationDistance) {
        super(PacketType.Play.Server.UPDATE_SIMULATION_DISTANCE);
        this.simulationDistance = simulationDistance;
    }

    @Override
    public void read() {
        this.simulationDistance = this.readVarInt();
    }

    @Override
    public void write() {
        this.writeVarInt(this.simulationDistance);
    }

    public void copy(
            WrapperPlayServerUpdateSimulationDistance wrapperPlayServerUpdateSimulationDistance) {
        this.simulationDistance = wrapperPlayServerUpdateSimulationDistance.simulationDistance;
    }

    public int getSimulationDistance() {
        return this.simulationDistance;
    }

    public void setSimulationDistance(int simulationDistance) {
        this.simulationDistance = simulationDistance;
    }
}
