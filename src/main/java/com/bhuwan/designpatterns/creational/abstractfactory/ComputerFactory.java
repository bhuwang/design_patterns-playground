/**
 * 
 */
package com.bhuwan.designpatterns.creational.abstractfactory;

/**
 * @author bhuwan
 *
 */
public class ComputerFactory {

    public static Computer getComputer(ComputerAbstractFactory factory) {
        return factory.createComputer();
    }
}
