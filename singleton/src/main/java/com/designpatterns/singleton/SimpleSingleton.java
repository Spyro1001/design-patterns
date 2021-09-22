package com.designpatterns.singleton;

public class SimpleSingleton {

    public static final SimpleSingleton INSTANCE = new SimpleSingleton();

    private SimpleSingleton() {
        // exists to defeat instantiation
    }
}
