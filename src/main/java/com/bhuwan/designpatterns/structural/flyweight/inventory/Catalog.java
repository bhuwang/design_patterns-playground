/**
 * 
 */
package com.bhuwan.designpatterns.structural.flyweight.inventory;

import java.util.HashMap;
import java.util.Map;

/**
 * Catalog acts as a factory and cache for Item flyweight objects.
 * 
 * @author bhuwan
 *
 */
public class Catalog {

    private Map<String, Item> items = new HashMap<>();

    // factory method in support
    public Item lookup(String itemName) {
        if (!items.containsKey(itemName)) {
            items.put(itemName, new Item(itemName));
        }
        return items.get(itemName);
    }

    public int totalItemsMade() {
        return items.size();
    }
}
