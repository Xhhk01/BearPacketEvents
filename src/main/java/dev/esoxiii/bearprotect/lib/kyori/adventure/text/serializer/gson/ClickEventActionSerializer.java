package dev.esoxiii.bearprotect.lib.kyori.adventure.text.serializer.gson;

import dev.esoxiii.bearprotect.lib.gson.TypeAdapter;
import dev.esoxiii.bearprotect.lib.kyori.adventure.text.event.ClickEvent;

final class ClickEventActionSerializer {

    static final TypeAdapter<ClickEvent.Action> INSTANCE =
            IndexedSerializer.lenient("click action", ClickEvent.Action.NAMES);

    private ClickEventActionSerializer() {}
}
