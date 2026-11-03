package dev.esoxiii.bearprotect.lib;

import dev.esoxiii.bearprotect.lib.com.github.retrooper.packetevents.factory.spigot.SpigotPacketEventsBuilder;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.PacketEvents;

import org.bukkit.plugin.java.JavaPlugin;

/**
 * Standalone plugin for the BearProtect PacketEvents fork (GPLv3). BearProtect depends on it
 * instead of bundling it, so the fork ships separately with its source.
 */
public class BearPacketEventsPlugin extends JavaPlugin {

    @Override
    public void onLoad() {
        PacketEvents.setAPI(SpigotPacketEventsBuilder.build(this));
        PacketEvents.getAPI()
                .getSettings()
                .reEncodeByDefault(false)
                .checkForUpdates(false)
                .fullStackTrace(false)
                .kickOnPacketException(true);
        PacketEvents.getAPI().load();
    }

    @Override
    public void onEnable() {
        PacketEvents.getAPI().init();
    }

    @Override
    public void onDisable() {
        PacketEvents.getAPI().terminate();
    }
}
