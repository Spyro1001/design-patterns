package com.designpatterns.bridge;

/**
 * This is the abstraction.  It contains a class of the implementor type.
 */
public abstract class RemoteControl {

    private TV implementor;

    public RemoteControl(TV tv) {
        this.implementor = tv;
    }

    public void on() {
        implementor.on();
    }

    public void off() {
        implementor.off();
    }

    public void setChannel(int channel) {
        implementor.tuneChannel(channel);
    }
}
