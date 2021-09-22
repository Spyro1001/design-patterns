package com.designpatterns.abstractfactory;

public class WidgetFactoryA implements AbstractWidgetFactory {

    private final String FACTORY = "A";

    @Override
    public Widget createWidgetA() {
        return new WidgetA();
    }

    @Override
    public Widget createWidgetA(String title) {
        return new WidgetA(FACTORY + title);
    }

    @Override
    public Widget createWidgetB() {
        return new WidgetB();
    }

    @Override
    public Widget createWidgetB(String title) {
        return new WidgetB(FACTORY + title);
    }
}
