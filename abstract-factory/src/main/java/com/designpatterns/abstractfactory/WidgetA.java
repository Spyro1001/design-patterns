package com.designpatterns.abstractfactory;

public class WidgetA extends AbstractWidgetA {

    public WidgetA() {

    }

    public WidgetA(String title) {
        this.title = title;
    }

    @Override
    public void invoke() {
        System.out.println("Widget A invoked.");
    }

}
