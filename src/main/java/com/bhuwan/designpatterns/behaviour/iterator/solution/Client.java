/**
 * 
 */
package com.bhuwan.designpatterns.behaviour.iterator.solution;

import java.util.Iterator;

/**
 * @author bhuwan
 *
 */
public class Client {

    /**
     * @param args
     */
    public static void main(String[] args) {
        BikeRepository repo = new BikeRepository();

        repo.addBike("Unicorn");
        repo.addBike("Bullet");
        repo.addBike("VR");

        Iterator<String> iterator = repo.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // OR

        for (String bike : repo) {
            System.out.println(bike);
        }
    }

}
