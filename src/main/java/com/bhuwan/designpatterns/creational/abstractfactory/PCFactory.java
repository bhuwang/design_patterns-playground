/**
 * 
 */
package com.bhuwan.designpatterns.creational.abstractfactory;

/**
 * @author bhuwan
 *
 */
public class PCFactory implements ComputerAbstractFactory {

    private String ram;
    private String hdd;
    private String cpu;

    public PCFactory(String ram, String hdd, String cpu) {
        this.ram = ram;
        this.hdd = hdd;
        this.cpu = cpu;
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.bhuwan.designpatterns.creational.abstractfactory.ComputerAbstractFactory#createComputer()
     */
    public Computer createComputer() {
        return new PC(cpu, hdd, ram);
    }

}
