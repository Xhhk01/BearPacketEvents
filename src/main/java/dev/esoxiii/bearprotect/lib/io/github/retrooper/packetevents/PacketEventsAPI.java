package dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents;

import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.event.EventManager;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.injector.ChannelInjector;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.manager.InternalPacketListener;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.manager.player.PlayerManager;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.manager.protocol.ProtocolManager;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.manager.server.ServerManager;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.netty.NettyManager;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.packettype.PacketType;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.world.states.WrappedBlockState;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.settings.PacketEventsSettings;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.util.LogManager;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.util.PEVersion;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.util.PEVersions;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.util.adventure.AdventureConversionInjector;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.util.logger.JulLegacyLogManager;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.util.mappings.SynchronizedRegistriesHandler;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.util.updatechecker.UpdateChecker;

import java.util.logging.Logger;

public abstract class PacketEventsAPI<T> {

    private final EventManager eventManager;

    private final PacketEventsSettings settings = new PacketEventsSettings();

    private final UpdateChecker updateChecker = new UpdateChecker();

    private final LogManager logManager = LogManager.construct(this);

    public PacketEventsAPI(EventManager eventManager2) {
        this.eventManager = eventManager2;
    }

    public PacketEventsAPI() {
        this(new EventManager());
    }

    public EventManager getEventManager() {
        return this.eventManager;
    }

    public PacketEventsSettings getSettings() {
        return this.settings;
    }

    public UpdateChecker getUpdateChecker() {
        return this.updateChecker;
    }

    public PEVersion getVersion() {
        return PEVersions.CURRENT;
    }

    @Deprecated
    public Logger getLogger() {
        return JulLegacyLogManager.getLogger();
    }

    public LogManager getLogManager() {
        return this.logManager;
    }

    public void load() {
        this.getLogManager().info("Loading packetevents...");
        WrappedBlockState.ensureLoad();
        SynchronizedRegistriesHandler.init();
        PacketType.prepare();
        AdventureConversionInjector.inject();
        this.registerInternalListener();
    }

    protected void registerInternalListener() {
        this.getEventManager().registerListener(new InternalPacketListener());
    }

    public abstract boolean isLoaded();

    public abstract void init();

    public abstract boolean isInitialized();

    public void terminate() {
        try {
            this.getInjector().uninject();
        } catch (Throwable throwable) {
            this.getLogManager()
                    .warn(
                            "Failed to uninject during termination, this error can be ignored on shutdown",
                            throwable);
        }
        this.getEventManager().unregisterAllListeners();
        AdventureConversionInjector.uninject();
    }

    public abstract boolean isTerminated();

    public abstract T getPlugin();

    public abstract ServerManager getServerManager();

    public abstract ProtocolManager getProtocolManager();

    public abstract PlayerManager getPlayerManager();

    public abstract NettyManager getNettyManager();

    public abstract ChannelInjector getInjector();
}
