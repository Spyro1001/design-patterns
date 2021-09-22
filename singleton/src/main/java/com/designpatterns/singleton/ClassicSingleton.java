package com.designpatterns.singleton;

public class ClassicSingleton {

    private static ClassicSingleton instance;

    private ClassicSingleton() {
        // exists only to defeat instantiation
    }

    public static ClassicSingleton getInstance() {
        // lazy instantiation
        if (instance == null) {
            instance = new ClassicSingleton();
        }
        return instance;
    }
}
