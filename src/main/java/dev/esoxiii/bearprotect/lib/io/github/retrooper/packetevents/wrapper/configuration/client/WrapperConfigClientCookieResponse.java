package dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.configuration.client;

import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.event.PacketReceiveEvent;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.event.PacketSendEvent;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.packettype.PacketType;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.resources.ResourceLocation;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.wrapper.common.client.WrapperCommonCookieResponse;

import org.jetbrains.annotations.Nullable;

public class WrapperConfigClientCookieResponse
        extends WrapperCommonCookieResponse<WrapperConfigClientCookieResponse> {

    @Deprecated
    public WrapperConfigClientCookieResponse(PacketSendEvent packetSendEvent) {
        super(packetSendEvent);
    }

    public WrapperConfigClientCookieResponse(PacketReceiveEvent packetReceiveEvent) {
        super(packetReceiveEvent);
    }

    public WrapperConfigClientCookieResponse(
            ResourceLocation resourceLocation, byte @Nullable [] values) {
        super(PacketType.Configuration.Client.COOKIE_RESPONSE, resourceLocation, values);
    }
}
