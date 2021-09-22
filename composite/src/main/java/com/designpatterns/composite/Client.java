package com.designpatterns.composite;

public class Client {
    /**
     * Given a graphics context, client can just call paint, without worrying if this is a composite
     * or leaf
     **/
    public static void main(String[] args) {

        Graphic root = new CompositeGraphic();
        Graphic leaf1 = new SimpleGraphic();
        Graphic leaf2 = new SimpleGraphic();

        ((CompositeGraphic) root).add(leaf1);
        ((CompositeGraphic) root).add(leaf2);

        root.paint();

    }

}
