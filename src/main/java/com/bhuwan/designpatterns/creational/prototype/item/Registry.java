package com.bhuwan.designpatterns.creational.prototype.item;

import java.util.HashMap;
import java.util.Map;

public class Registry {

    private Map<ItemType, Item> items = new HashMap<ItemType, Item>();

    public Registry() {
        loadItems();
    }

    public Item createItem(ItemType type) {
        Item item = null;
        try {
            item = (Item) (items.get(type)).clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return item;
    }

    private void loadItems() {
        Movie movie = new Movie();
        movie.setTitle("Basic Movie");
        movie.setPrice(50);
        movie.setRuntime("2 hour 30 min");
        items.put(ItemType.MOVIE, movie);

        Book book = new Book();
        book.setNoOfPages(156);
        book.setPrice(10);
        book.setTitle("Good to Great");
        items.put(ItemType.BOOK, book);
    }
}
