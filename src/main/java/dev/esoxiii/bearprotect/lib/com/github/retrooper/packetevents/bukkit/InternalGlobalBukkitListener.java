package dev.esoxiii.bearprotect.lib.com.github.retrooper.packetevents.bukkit;

import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.PacketEvents;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.event.UserLoginEvent;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.player.User;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class InternalGlobalBukkitListener implements Listener {

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent playerJoinEvent) {
        User user = PacketEvents.getAPI().getPlayerManager().getUser(playerJoinEvent.getPlayer());
        PacketEvents.getAPI()
                .getEventManager()
                .callEvent(new UserLoginEvent(user, playerJoinEvent.getPlayer()));
    }
}
