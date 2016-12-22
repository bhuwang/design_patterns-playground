/**
 * 
 */
package com.bhuwan.designpatterns.structural.flyweight.inventory;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @author bhuwan
 *
 */
public class InventroySystem {

    private final Catalog catalog = new Catalog();
    private final List<Order> orders = new CopyOnWriteArrayList<>();

    void takeOrder(String itemName, int orderNumber) {
        Item item = catalog.lookup(itemName);
        Order order = new Order(orderNumber, item);
        orders.add(order);
    }

    void process() {
        for (Order order : orders) {
            order.processOrder();
            orders.remove(order);
        }
    }

    String report() {
        return "\n Total Item objects made: " + catalog.totalItemsMade();
    }
}
