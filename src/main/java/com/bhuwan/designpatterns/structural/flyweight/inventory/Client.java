/**
 * 
 */
package com.bhuwan.designpatterns.structural.flyweight.inventory;

/**
 * @author bhuwan
 *
 */
public class Client {

    /**
     * @param args
     */
    public static void main(String[] args) {
        InventroySystem ims = new InventroySystem();

        ims.takeOrder("Roomba", 221);
        ims.takeOrder("Bose Headphones", 361);
        ims.takeOrder("Samsung TV", 432);
        ims.takeOrder("Samsung TV", 323);
        ims.takeOrder("Roomba", 222);
        ims.takeOrder("Bose Headphones", 363);
        ims.takeOrder("Samsung TV", 434);
        ims.takeOrder("Samsung TV", 324);
        ims.takeOrder("Roomba", 225);
        ims.takeOrder("Bose Headphones", 366);
        ims.takeOrder("Samsung TV", 437);
        ims.takeOrder("Samsung TV", 328);

        ims.process();
        System.out.println(ims.report());

    }

}
