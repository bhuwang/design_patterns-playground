/**
 * 
 */
package com.bhuwan.designpatterns.creational.singleton;

import java.io.Serializable;

/**
 * <pre>
 * The problem with this serialized singleton class is that whenever we de-serialize it, 
 * it will create a new instance of the class
 * </pre>
 * 
 * @author bhuwan
 *
 */
public class SerializedSingleton implements Serializable {

    private static final long serialVersionUID = -7200417858760661712L;

    private SerializedSingleton() {
    }

    private static class SingletonHelper {
        private static final SerializedSingleton instance = new SerializedSingleton();
    }

    public static SerializedSingleton getInstance() {
        return SingletonHelper.instance;
    }

    /**
     * <pre>
     * When we de-serialize the singleton class, it destroys the singleton pattern.
     * To overcome this scenario all we need to do is to provide the implementation of readResolve() method.
     * 
     * see what happen when you run {@link SerializedSingletonTest} class with/without the overriding the method below.
     * </pre>
     */
    protected Object readResolve() {
        return getInstance();
    }

}
