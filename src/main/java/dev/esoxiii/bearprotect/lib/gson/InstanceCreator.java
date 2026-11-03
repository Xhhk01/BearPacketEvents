package dev.esoxiii.bearprotect.lib.gson;

import java.lang.reflect.Type;

public interface InstanceCreator<T> {

    T createInstance(Type type);
}
