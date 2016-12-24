/**
 * 
 */
package com.bhuwan.designpatterns.creational.singleton;

/**
 * @author bhuwan
 *
 */
public class DoubleCheckLockingSingleton {

    /**
     * Here declaring instance variable to volatile for visibility in case of multi-core CPU. It maintain the happens before link to the
     * last write value.
     */
    private static volatile DoubleCheckLockingSingleton instance;
    private static Object key = new Object();

    private DoubleCheckLockingSingleton() {
    }

    /**
     * <pre>
     * Two very important notion of concurrent programming:
     * Atomicity  = Synchronized
     * Visibility = Volatile - Happens before link
     * 
     * Here we are using double check lock (DCL) to achieve performance gain in case of multi threaded environment.
     * 
     * This is the complete implementation for singleton pattern.
     * </pre>
     * 
     * @return instance of {@link DoubleCheckLockingSingleton} object
     */
    public static DoubleCheckLockingSingleton getInstance() {
        if (instance == null) {
            synchronized (key) {
                if (instance == null) {
                    instance = new DoubleCheckLockingSingleton();
                }
            }
        }
        return instance;
    }
}
