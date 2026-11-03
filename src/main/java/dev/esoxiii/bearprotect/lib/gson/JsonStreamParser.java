package dev.esoxiii.bearprotect.lib.gson;

import dev.esoxiii.bearprotect.lib.gson.internal.Streams;
import dev.esoxiii.bearprotect.lib.gson.stream.JsonReader;
import dev.esoxiii.bearprotect.lib.gson.stream.JsonToken;
import dev.esoxiii.bearprotect.lib.gson.stream.MalformedJsonException;

import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.Iterator;
import java.util.NoSuchElementException;

public final class JsonStreamParser implements Iterator<JsonElement> {

    private final JsonReader parser;

    private final Object lock;

    public JsonStreamParser(String text) {
        this(new StringReader(text));
    }

    public JsonStreamParser(Reader reader) {
        this.parser = new JsonReader(reader);
        this.parser.setLenient(true);
        this.lock = new Object();
    }

    public JsonElement next() throws JsonParseException {
        if (!this.hasNext()) {
            throw new NoSuchElementException();
        }
        try {
            return Streams.parse(this.parser);
        } catch (StackOverflowError stackOverflowError) {
            throw new JsonParseException("Failed parsing JSON source to Json", stackOverflowError);
        } catch (OutOfMemoryError outOfMemoryError) {
            throw new JsonParseException("Failed parsing JSON source to Json", outOfMemoryError);
        } catch (JsonParseException jsonParseException) {
            throw jsonParseException.getCause() instanceof EOFException
                    ? new NoSuchElementException()
                    : jsonParseException;
        }
    }

    @Override
    public boolean hasNext() {
        synchronized (this.lock) {
            boolean matches;
            try {
                matches = this.parser.peek() != JsonToken.END_DOCUMENT;
            } catch (MalformedJsonException malformedJsonException) {
                throw new JsonSyntaxException(malformedJsonException);
            } catch (IOException oException) {
                throw new JsonIOException(oException);
            }
            return matches;
        }
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
