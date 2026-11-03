package dev.esoxiii.bearprotect.lib.gson.internal;

import dev.esoxiii.bearprotect.lib.gson.JsonElement;
import dev.esoxiii.bearprotect.lib.gson.JsonIOException;
import dev.esoxiii.bearprotect.lib.gson.JsonNull;
import dev.esoxiii.bearprotect.lib.gson.JsonParseException;
import dev.esoxiii.bearprotect.lib.gson.JsonSyntaxException;
import dev.esoxiii.bearprotect.lib.gson.internal.bind.TypeAdapters;
import dev.esoxiii.bearprotect.lib.gson.stream.JsonReader;
import dev.esoxiii.bearprotect.lib.gson.stream.JsonWriter;
import dev.esoxiii.bearprotect.lib.gson.stream.MalformedJsonException;

import java.io.EOFException;
import java.io.IOException;
import java.io.Writer;

public final class Streams {

    private Streams() {
        throw new UnsupportedOperationException();
    }

    public static JsonElement parse(JsonReader jsonReader) throws JsonParseException {
        boolean matches = true;
        try {
            jsonReader.peek();
            matches = false;
            return TypeAdapters.JSON_ELEMENT.read(jsonReader);
        } catch (EOFException eOFException) {
            if (matches) {
                return JsonNull.INSTANCE;
            } else {
                throw new JsonSyntaxException(eOFException);
            }
        } catch (MalformedJsonException malformedJsonException) {
            throw new JsonSyntaxException(malformedJsonException);
        } catch (IOException oException) {
            throw new JsonIOException(oException);
        } catch (NumberFormatException numberFormatException) {
            throw new JsonSyntaxException(numberFormatException);
        }
    }

    public static void write(JsonElement jsonElement, JsonWriter jsonWriter) throws IOException {
        TypeAdapters.JSON_ELEMENT.write(jsonWriter, jsonElement);
    }

    public static Writer writerForAppendable(Appendable appendable) {
        return appendable instanceof Writer
                ? (Writer) appendable
                : new Streams.AppendableWriter(appendable);
    }

    private static final class AppendableWriter extends Writer {

        private final Appendable appendable;

        private final Streams.AppendableWriter.CurrentWrite currentWrite =
                new Streams.AppendableWriter.CurrentWrite();

        AppendableWriter(Appendable appendable2) {
            this.appendable = appendable2;
        }

        @Override
        public void write(char[] values, int value, int value2) throws IOException {
            this.currentWrite.chars = values;
            this.appendable.append(this.currentWrite, value, value + value2);
        }

        @Override
        public void write(int value) throws IOException {
            this.appendable.append((char) value);
        }

        @Override
        public void flush() {}

        @Override
        public void close() {}

        static class CurrentWrite implements CharSequence {

            char[] chars;

            @Override
            public int length() {
                return this.chars.length;
            }

            @Override
            public char charAt(int value) {
                return this.chars[value];
            }

            @Override
            public CharSequence subSequence(int value, int value2) {
                return new String(this.chars, value, value2 - value);
            }
        }
    }
}
