package com.designpatterns.abstractfactory;

public interface AbstractWidgetFactory {

    Widget createWidgetA();

    Widget createWidgetA(String title);

    Widget createWidgetB();

    Widget createWidgetB(String title);
}
