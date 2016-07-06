/**
 * 
 */
package com.bhuwan.designpatterns.creational.singleton;

/**
 * @author bhuwan
 *
 */
public class EagerInitialization {

    public static final EagerInitialization instance = new EagerInitialization();

    private EagerInitialization() {
    }

    public static EagerInitialization getInstance() {
        return instance;
    }
}
