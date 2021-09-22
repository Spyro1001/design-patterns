package com.designpatterns.composite;

//Leaf
public class SimpleGraphic
    implements Graphic {

    /*
     * Because we have no children, these operations will do nothing
     */
    public void add(Graphic g) {
        //unsupported operation
    }

    public void remove(Graphic g) {
        //unsupported operation
    }

    public Graphic get(int index) {
        //unsupported operation
        return null;
    }

    public void paint() {
        System.out.println("Leaf ");
    }

}
