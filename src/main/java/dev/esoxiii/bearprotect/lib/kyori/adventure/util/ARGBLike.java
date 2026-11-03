package dev.esoxiii.bearprotect.lib.kyori.adventure.util;

import org.jetbrains.annotations.Range;

public interface ARGBLike extends RGBLike {

    @Range(from = 0L, to = 255L)
    int alpha();
}
