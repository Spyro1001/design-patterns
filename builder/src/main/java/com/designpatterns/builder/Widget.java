package com.designpatterns.builder;

import lombok.Getter;
import lombok.ToString;

/**
 * Represents a generic, immutable, Widget object with a builder.
 */
@Getter
@ToString
public class Widget {

    // required params
    private int valueA;
    private double valueB;

    // optional params
    private String valueC;
    private String valueD;

    private Widget() {
        this.valueA = -1;
        this.valueB = -1.0;
    }

    public static WidgetBuilder builder() {
        return new WidgetBuilder();
    }

    // builder class
    public static class WidgetBuilder {

        private Widget widget;

        private WidgetBuilder() {
            this.widget = new Widget();
        }

        public WidgetBuilder withValueA(int valueA) {
            this.widget.valueA = valueA;
            return this;
        }

        public WidgetBuilder withValueB(double valueB) {
            this.widget.valueB = valueB;
            return this;
        }

        public WidgetBuilder withValueC(String valueC) {
            this.widget.valueC = valueC;
            return this;
        }

        public WidgetBuilder withValueD(String valueD) {
            this.widget.valueD = valueD;
            return this;
        }

        public Widget build() {
            if (!widgetIsValid(this.widget)) {
                throw new IllegalStateException("Required values are missing!");
            } else {
                return this.widget;
            }
        }

        // validation logic
        private boolean widgetIsValid(Widget widget) {
            return widget.valueA != -1 && widget.valueB != -1.0;
        }

    }


}
