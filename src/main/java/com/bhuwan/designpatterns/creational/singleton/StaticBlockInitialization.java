/**
 * 
 */
package com.bhuwan.designpatterns.creational.singleton;

/**
 * @author bhuwan
 *
 */
public class StaticBlockInitialization {

    private static StaticBlockInitialization instance;

    private StaticBlockInitialization() {
    }

    static {
        try {
            instance = new StaticBlockInitialization();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public StaticBlockInitialization getInstance() {
        return instance;
    }
}
