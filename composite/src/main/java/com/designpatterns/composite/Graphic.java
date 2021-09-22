package com.designpatterns.composite;

public interface Graphic {

    void remove(Graphic g);

    Graphic get(int index);

    void paint();

}
