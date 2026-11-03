package dev.esoxiii.bearprotect.lib.kyori.adventure.text.serializer.gson;

import dev.esoxiii.bearprotect.lib.gson.TypeAdapter;
import dev.esoxiii.bearprotect.lib.kyori.adventure.text.event.HoverEvent;

final class HoverEventActionSerializer {

    static final TypeAdapter<HoverEvent.Action<?>> INSTANCE =
            IndexedSerializer.lenient("hover action", HoverEvent.Action.NAMES);

    private HoverEventActionSerializer() {}
}
