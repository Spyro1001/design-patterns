package com.example;

import java.util.Objects;

public class Widget {

    private int count;

    public Widget(Integer count) {
        this.count = count;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Widget widget = (Widget) o;
        return count == widget.count;
    }

    @Override
    public int hashCode() {
        return Objects.hash(count);
    }
}
