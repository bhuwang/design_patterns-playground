/**
 * 
 */
package com.bhuwan.designpatterns.creational.singleton;

/**
 * @author bhuwan
 *
 */
public class BlockLevelThreadSafeSingleton {

    private static BlockLevelThreadSafeSingleton instance;

    private BlockLevelThreadSafeSingleton() {
    }

    public static BlockLevelThreadSafeSingleton getInstance() {
        synchronized (BlockLevelThreadSafeSingleton.class) {
            if (instance == null) {
                instance = new BlockLevelThreadSafeSingleton();
            }
        }
        return instance;
    }
}
