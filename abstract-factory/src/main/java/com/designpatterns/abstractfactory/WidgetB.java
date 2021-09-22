package com.designpatterns.abstractfactory;

public class WidgetB extends AbstractWidgetB {

    public WidgetB() {

    }

    public WidgetB(String title) {
        this.title = title;
    }

    @Override
    public void invoke() {
        System.out.println("Widget B invoked.");
    }
}
