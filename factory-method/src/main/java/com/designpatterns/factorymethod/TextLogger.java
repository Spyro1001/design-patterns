package com.designpatterns.factorymethod;

public class TextLogger implements Logger {

    @Override
    public void log(String message) {
        System.out.println(message);
    }

    @Override
    public void error(String message) {
        System.err.println(message);
    }
}
