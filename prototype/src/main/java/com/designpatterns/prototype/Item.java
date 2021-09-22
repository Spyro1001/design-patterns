package com.designpatterns.prototype;

//Prototype
public abstract class Item implements Cloneable {

    private String title;
    private double price;

    @Override
    public Item clone() {

        Item clonedItem = null;

        try {

            // default clone - can cause CloneNotSupportedException
            clonedItem = (Item) super.clone();

            // specialized clone
            clonedItem.setPrice(price);
            clonedItem.setTitle(title);

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return clonedItem;
    }

    public String getTitle() {
        return this.title;
    }

    public double getPrice() {
        return this.price;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
