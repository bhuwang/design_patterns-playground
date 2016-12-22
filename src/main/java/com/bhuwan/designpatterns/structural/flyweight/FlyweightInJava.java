/**
 * 
 */
package com.bhuwan.designpatterns.structural.flyweight;

/**
 * @author bhuwan
 *
 */
public class FlyweightInJava {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Integer twentyFirst = Integer.valueOf(20);
        Integer twentySecond = Integer.valueOf(20);

        Integer twoTtwentyFirst = Integer.valueOf(220);
        Integer twoTwentySecond = Integer.valueOf(220);

        // Both should print the same hascode because it will get from the integer literal pool.
        System.out.println("twentyFirst:\t" + System.identityHashCode(twentyFirst));
        System.out.println("twentySecond:\t" + System.identityHashCode(twentySecond));

        // But the same will not happen to the below code
        // It is because java by default cache 8 byte of integers ie. upto 127
        System.out.println("twoTtwentyFirst:\t" + System.identityHashCode(twoTtwentyFirst));
        System.out.println("twoTwentySecond:\t" + System.identityHashCode(twoTwentySecond));
    }

}
