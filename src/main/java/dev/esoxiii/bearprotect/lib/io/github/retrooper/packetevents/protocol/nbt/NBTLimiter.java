package dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.protocol.nbt;

import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.exception.PacketLimitException;
import dev.esoxiii.bearprotect.lib.io.github.retrooper.packetevents.netty.buffer.ByteBufHelper;

import org.jetbrains.annotations.ApiStatus.NonExtendable;
import org.jspecify.annotations.NullMarked;
import org.jspecify.annotations.Nullable;

@NullMarked
@NonExtendable
public interface NBTLimiter {

    int DEFAULT_MAX_SIZE = Integer.getInteger("packetevents.nbt.default-max-size", 2097152);

    int DEFAULT_MAX_DEPTH = Integer.getInteger("packetevents.nbt.default-max-depth", 512);

    static NBTLimiter noop() {
        return new NBTLimiter() {

            @Override
            public void increment(int bytes) {}

            @Override
            public void ensureReadable(int bytes) {}

            @Override
            public void enterDepth() {}

            @Override
            public void exitDepth() {}

            @Override
            public void countElements(int count) {}
        };
    }

    static NBTLimiter forBuffer(Object buffer) {
        return forBuffer(buffer, DEFAULT_MAX_SIZE);
    }

    static NBTLimiter forBuffer(Object buffer, int maxBytes) {
        return forBuffer(buffer, maxBytes, DEFAULT_MAX_DEPTH);
    }

    static NBTLimiter forBuffer(Object buffer, int maxBytes, int maxDepth) {
        return forBuffer(buffer, maxBytes, maxDepth, null);
    }

    static NBTLimiter forBuffer(
            final Object buffer,
            final int maxBytes,
            final int maxDepth,
            @Nullable final NBTElementCounter elementCounter) {
        return new NBTLimiter() {

            private int bytes;

            private int depth;

            @Override
            public void increment(int bytes) {
                if (bytes < 0) {
                    throw new IllegalArgumentException(
                            "Can't increment NBT limiter by negative amount: " + bytes);
                }
                if (this.bytes + bytes > maxBytes) {
                    throw new PacketLimitException(
                            PacketLimitException.Limit.NBT_SIZE, (long) this.bytes + bytes, maxBytes);
                }
                this.bytes += bytes;
            }

            @Override
            public void ensureReadable(int bytes) {
                int readable = ByteBufHelper.readableBytes(buffer);
                if (bytes > readable) {
                    throw new IllegalArgumentException(
                            "Can't read more than possible: " + bytes + " > " + readable);
                }
            }

            @Override
            public void enterDepth() {
                if (this.depth >= maxDepth) {
                    throw new PacketLimitException(
                            PacketLimitException.Limit.NBT_DEPTH, this.depth + 1L, maxDepth);
                }
                this.depth++;
            }

            @Override
            public void exitDepth() {
                if (this.depth <= 0) {
                    throw new IllegalArgumentException("Can't exit top-level depth");
                }
                this.depth--;
            }

            @Override
            public void countElements(int count) {
                if (elementCounter != null) {
                    elementCounter.add(count);
                }
            }
        };
    }

    /** Adds read bytes, throws {@link PacketLimitException} past the size limit. */
    void increment(int bytes);

    /** Throws when the buffer has fewer than {@code bytes} left, before allocating for them. */
    void ensureReadable(int bytes);

    /** Throws {@link PacketLimitException} when nesting goes past the depth limit. */
    void enterDepth();

    void exitDepth();

    /** Counts tags against the per-packet element limit, see {@link NBTElementCounter}. */
    void countElements(int count);
}
