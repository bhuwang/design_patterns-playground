/**
 * 
 */
package com.bhuwan.designpatterns.creational.singleton;

/**
 * @author bhuwan
 *
 */
public class ThreadSafeSingleton {

    private static ThreadSafeSingleton instance;

    private ThreadSafeSingleton() {
    }

    public static synchronized ThreadSafeSingleton getInstance() {
        return instance == null ? new ThreadSafeSingleton() : instance;
    }
}
