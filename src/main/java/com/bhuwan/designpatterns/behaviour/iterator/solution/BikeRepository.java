/**
 * 
 */
package com.bhuwan.designpatterns.behaviour.iterator.solution;

import java.util.Iterator;

/**
 * @author bhuwan
 *
 */
public class BikeRepository implements Iterable<String> {

    private String[] bikes;
    private int index;

    public BikeRepository() {
        this.bikes = new String[10];
        this.index = 0;
    }

    public void addBike(String bike) {
        if (index == bikes.length) {
            String[] largerBikes = new String[bikes.length + 5];
            System.arraycopy(bikes, 0, largerBikes, 0, bikes.length);
            bikes = largerBikes;
            largerBikes = null;
        }
        bikes[index] = bike;
        index++;
    }

    @Override
    public Iterator<String> iterator() {
        return new Iterator<String>() {
            private int currentIndex = 0;

            @Override
            public String next() {
                return bikes[currentIndex++];
            }

            @Override
            public boolean hasNext() {
                return currentIndex < bikes.length && bikes[currentIndex] != null;
            }

            @Override
            public void remove() {
                // bikes[currentIndex--] = null;
                throw new UnsupportedOperationException();
            }
        };
    }
}
