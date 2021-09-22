package com.designpatterns.singleton;

public class Client {

    public static void main(String[] args) {

        ClassicSingleton classicSingleton = ClassicSingleton.getInstance();

        SimpleSingleton simpleSingleton = SimpleSingleton.INSTANCE;

        SynchronizedSingleton synchronizedSingleton = SynchronizedSingleton.getInstance();

    }
}
