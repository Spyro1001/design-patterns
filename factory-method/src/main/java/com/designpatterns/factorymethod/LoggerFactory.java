package com.designpatterns.factorymethod;

public class LoggerFactory {

    public static Logger getLogger(String logger) {

        switch (logger) {
            case "TEXT":
                return new TextLogger();
            case "XML":
                return new XMLLogger();
            default:
                return new XMLLogger();
        }
    }
}
