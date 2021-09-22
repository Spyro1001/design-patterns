package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.List;

import java.util.stream.Collectors;

/**
 * Factory Pattern
 * <p>
 * Consists of a factory class responsible for creating one or more types of objects.
 * <p>
 * Factory class is a plain class and doesn't implement any interface.
 * <p>
 * Factory class contains a method which produces an object based on a given input.
 * <p>
 * One generalized factory capable of producing one or more types of objects.
 * <p>
 * Use Case: To create an object for a specific purpose, but don't care about what concrete type is suitable, prefer
 * Factory.  It creates and returns the suitable object.
 */
public class Factory {

    private static final Logger logger = LoggerFactory.getLogger(Factory.class.getName());

    public static <T> T getInstance(Class<T> clazz) throws Exception {
        return clazz.getConstructor().newInstance();
    }

    public static <T> T getInstance(Class<T> clazz, Object... args) throws Exception {

        // convert varargs to list of type names
        List<Class<?>> types = Arrays.stream(args)
                                     .map(o -> o.getClass().getTypeName())
                                     .map(Factory::convert)
                                     .collect(Collectors.toList());

        Class<?>[] arr = new Class<?>[types.size()];
        types.toArray(arr);

        return clazz.getConstructor(arr).newInstance(args);
    }

    private static Class<?> convert(String type) {
        Class<?> clazzType = null;
        try {
            clazzType = Class.forName(type);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return clazzType;
    }
}
