/**
 * 
 */
package com.bhuwan.designpatterns.creational.singleton;

/**
 * @author bhuwan
 *
 */
public class BlockLevelThreadSafeSingleton {

    // volatile for happens-before
    private static volatile BlockLevelThreadSafeSingleton instance;

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
