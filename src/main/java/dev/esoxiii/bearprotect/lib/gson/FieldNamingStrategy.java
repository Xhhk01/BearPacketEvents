package dev.esoxiii.bearprotect.lib.gson;

import java.lang.reflect.Field;

public interface FieldNamingStrategy {

    String translateName(Field field);
}
