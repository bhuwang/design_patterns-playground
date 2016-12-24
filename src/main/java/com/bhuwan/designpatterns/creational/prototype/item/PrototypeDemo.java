/**
 * 
 */
package com.bhuwan.designpatterns.creational.prototype.item;

/**
 * @author bhuwan
 *
 */
public class PrototypeDemo {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Registry registry = new Registry();
        Movie creationalPattern = (Movie) registry.createItem(ItemType.MOVIE);
        creationalPattern.setTitle("Creational Pattern in JAVA");
        System.out.println(creationalPattern);

        Movie gof = (Movie) registry.createItem(ItemType.MOVIE);
        gof.setTitle("Gang of Four");
        System.out.println(gof);
    }

}
