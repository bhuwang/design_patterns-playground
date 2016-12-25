/**
 * 
 */
package com.bhuwan.designpatterns.behaviour.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author bhuwan
 *
 */
public class IteratorEverydayDemo {

    /**
     * @param args
     */
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        names.add("Bhuwan");
        names.add("Bipen");
        names.add("Naresh");

        Iterator<String> iterator = names.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
            iterator.remove();
        }

        System.out.println("Size of names: " + names.size());
    }

}
