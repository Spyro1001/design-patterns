package com.designpatterns.composite;

import java.util.ArrayList;
import java.util.List;

public class CompositeGraphic
    implements Graphic {

    private List<Graphic> children;

    public CompositeGraphic() {
        children = new ArrayList<>();
    }

    public void add(Graphic g) {
        children.add(g);
    }

    public void remove(Graphic g) {
        if (children.contains(g)) {
            children.remove(g);
        }
    }

    public Graphic get(int index) {
        if (index < children.size()) {
            return children.get(index);
        }
        return null;
    }

    public void paint() {

        //run the paint operation for each child
        for (Graphic g : children) {
            g.paint();
        }
        System.out.println("Internal ");
    }
}
