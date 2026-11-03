package dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.play.server;

import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.event.PacketSendEvent;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.packettype.PacketType;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.common.server.WrapperCommonServerCustomReportDetails;

import java.util.Map;

public class WrapperPlayServerCustomReportDetails
        extends WrapperCommonServerCustomReportDetails<WrapperPlayServerCustomReportDetails> {

    public WrapperPlayServerCustomReportDetails(PacketSendEvent packetSendEvent) {
        super(packetSendEvent);
    }

    public WrapperPlayServerCustomReportDetails(Map<String, String> entries) {
        super(PacketType.Play.Server.CUSTOM_REPORT_DETAILS, entries);
    }
}
