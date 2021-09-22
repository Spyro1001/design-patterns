package com.designpatterns.singleton;

/**
 * Thread safe Singleton
 */
public class SynchronizedSingleton {

    private static SynchronizedSingleton instance;

    private SynchronizedSingleton() {
        // exists only to defeat instantiation
    }

    public synchronized static SynchronizedSingleton getInstance() {

        // lazy instantiation
        if (instance == null) {
            instance = new SynchronizedSingleton();
        }
        return instance;
    }

}
