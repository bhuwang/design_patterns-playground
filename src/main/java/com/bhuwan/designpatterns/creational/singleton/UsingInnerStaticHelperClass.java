/**
 * 
 */
package com.bhuwan.designpatterns.creational.singleton;

/**
 * Also known as Bill Pugh Singleton approach.
 * 
 * This is the recommended approach.
 * 
 * @author bhuwan
 *
 */
public class UsingInnerStaticHelperClass {

    private UsingInnerStaticHelperClass() {
    }

    private static class SingletonHelper {
        private static final UsingInnerStaticHelperClass instance = new UsingInnerStaticHelperClass();
    }

    public static UsingInnerStaticHelperClass getInstance() {
        return SingletonHelper.instance;
    }
}
