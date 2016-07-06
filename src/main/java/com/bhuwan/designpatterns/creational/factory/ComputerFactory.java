/**
 * 
 */
package com.bhuwan.designpatterns.creational.factory;

/**
 * @author bhuwan
 *
 */
public class ComputerFactory {

    private ComputerFactory() {
    }

    public static Computer getComputer(ComputerTypes type, String ram, String hdd, String cpu) {
        Computer computer = null;
        if (ComputerTypes.PC.equals(type)) {
            computer = new PC(ram, hdd, cpu);
        } else if (ComputerTypes.SERVER.equals(type)) {
            computer = new Server(ram, hdd, cpu);
        }
        return computer;
    }
}
