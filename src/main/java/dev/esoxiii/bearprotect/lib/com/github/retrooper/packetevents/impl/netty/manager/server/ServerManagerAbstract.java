package dev.esoxiii.bearprotect.lib.com.github.retrooper.packetevents.impl.netty.manager.server;

import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.manager.server.ServerManager;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.manager.server.ServerVersion;

public abstract class ServerManagerAbstract implements ServerManager {

    @Override
    public abstract ServerVersion getVersion();
}
