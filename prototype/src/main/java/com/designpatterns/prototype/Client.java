package com.designpatterns.prototype;

/**
 * Prototype pattern that uses object pooling to deliver clones.
 */

public class Client {
    public static void main(String[] args) {
        ItemRegistry registry = new ItemRegistry();
        Book myBook = (Book) registry.createBasicItem("Book");
        myBook.setTitle("Title");
    }
}
