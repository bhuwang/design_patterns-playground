/**
 * 
 */
package com.bhuwan.designpatterns.creational.abstractfactory;

/**
 * @author bhuwan
 *
 */
public class ServerFactory implements ComputerAbstractFactory {

    private String ram;
    private String cpu;
    private String hdd;

    public ServerFactory(String ram, String cpu, String hdd) {
        this.ram = ram;
        this.cpu = cpu;
        this.hdd = hdd;
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.bhuwan.designpatterns.creational.abstractfactory.ComputerAbstractFactory#createComputer()
     */
    public Computer createComputer() {
        return new Server(cpu, hdd, ram);
    }
}
