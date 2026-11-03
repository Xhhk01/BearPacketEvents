package dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.stats;

import dev.esoxiii.bearprotect.lib.kyori.adventure.text.Component;

public interface Statistic {

    String getId();

    Component display();
}
