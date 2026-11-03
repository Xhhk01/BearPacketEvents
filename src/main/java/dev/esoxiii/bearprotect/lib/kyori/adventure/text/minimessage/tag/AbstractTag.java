package dev.esoxiii.bearprotect.lib.kyori.adventure.text.minimessage.tag;

import dev.esoxiii.bearprotect.lib.kyori.adventure.internal.Internals;
import dev.esoxiii.bearprotect.lib.kyori.examination.Examinable;

abstract class AbstractTag implements Tag, Examinable {

    @Override
    public final String toString() {
        return Internals.toString(this);
    }
}
