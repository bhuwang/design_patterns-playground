/**
 * 
 */
package com.bhuwan.designpatterns.creational.singleton;

import java.lang.reflect.Constructor;

/**
 * Reflection can be used to destroy all the above singleton implementation approaches.
 * 
 * @author bhuwan
 *
 */
public class ReflectionSingletonTest {

    /**
     * @param args
     */
    public static void main(String[] args) {
        UsingInnerStaticHelperClass one = UsingInnerStaticHelperClass.getInstance();
        UsingInnerStaticHelperClass two = null;

        Constructor<?>[] constructors = UsingInnerStaticHelperClass.class.getDeclaredConstructors();
        for (Constructor<?> con : constructors) {
            con.setAccessible(true);
            two = UsingInnerStaticHelperClass.getInstance();
            break;
        }

        System.out.println(one.hashCode());
        System.out.println(two.hashCode());

    }

}
