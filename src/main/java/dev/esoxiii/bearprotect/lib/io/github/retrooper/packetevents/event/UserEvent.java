package dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.event;

import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.player.User;

import org.jspecify.annotations.NullMarked;

@NullMarked
public interface UserEvent {

    User getUser();
}
