package dev.esoxiii.bearprotect.lib.com.github.retrooper.packetevents.injector.connection;

import dev.esoxiii.bearprotect.lib.com.github.retrooper.packetevents.util.viaversion.ViaVersionUtil;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.manager.PreViaSupport;

import org.jetbrains.annotations.ApiStatus.Internal;

@Internal
public final class PreViaPipelineSupport {

    private PreViaPipelineSupport() {}

    public static PreViaPipelineSupport.DispatchMode getDispatchMode() {
        if (!PreViaSupport.hasPreViaListeners()) {
            return PreViaPipelineSupport.DispatchMode.DISABLED;
        } else {
            return ViaVersionUtil.isAvailable()
                    ? PreViaPipelineSupport.DispatchMode.PIPELINE
                    : PreViaPipelineSupport.DispatchMode.FALLBACK;
        }
    }

    public static boolean shouldDispatchFallbackPreViaEvents(boolean preVia) {
        return !preVia && getDispatchMode() == PreViaPipelineSupport.DispatchMode.FALLBACK;
    }

    public enum DispatchMode {
        DISABLED,
        FALLBACK,
        PIPELINE
    }
}
