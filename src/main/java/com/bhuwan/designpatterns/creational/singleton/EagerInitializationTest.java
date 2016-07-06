/**
 * 
 */
package com.bhuwan.designpatterns.creational.singleton;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author bhuwan
 *
 */
public class EagerInitializationTest {

    /**
     * Test method for {@link com.bhuwan.designpatterns.creational.singleton.EagerInitialization#getInstance()}.
     */
    @Test
    public void testGetInstance() {
        EagerInitialization instance = EagerInitialization.getInstance();

        EagerInitialization instance2 = EagerInitialization.getInstance();

        Assert.assertEquals(instance, instance2);
    }

}
