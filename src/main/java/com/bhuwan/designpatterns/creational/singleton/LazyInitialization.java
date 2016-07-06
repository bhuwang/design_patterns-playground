/**
 * 
 */
package com.bhuwan.designpatterns.creational.singleton;

/**
 * @author bhuwan
 *
 */
public class LazyInitialization {

    private static LazyInitialization instance;

    private LazyInitialization() {
    }

    public static LazyInitialization getInstance() {
        return instance == null ? instance = new LazyInitialization() : instance;
    }
}
