package com.designpatterns.bridge;

/**
 * Refined/concrete abstraction
 */

public class ConcreteRemoteControl
    extends RemoteControl {

    private int currentChannel;

    public ConcreteRemoteControl(TV tv) {
        super(tv);
    }

    public void nextChannel() {
        currentChannel++;
        setChannel(currentChannel);
    }

    public void prevChannel() {
        currentChannel--;
        setChannel(currentChannel);
    }

}
