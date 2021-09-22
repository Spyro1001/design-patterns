package com.designpatterns.bridge;

/**
 * Concrete implementor
 */
public class Sony
    implements TV {

    protected boolean on;

    @Override
    public void on() {
        this.on = true;
    }

    @Override
    public void off() {
        this.on = false;
    }

    @Override
    public void tuneChannel(int channel) {

    }
}
