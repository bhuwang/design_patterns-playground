/**
 * 
 */
package com.bhuwan.designpatterns.creational.abstractfactory;

/**
 * @author bhuwan
 *
 */
public class Server extends Computer {

    private String cpu;
    private String hdd;
    private String ram;

    public Server(String cpu, String hdd, String ram) {
        this.cpu = cpu;
        this.hdd = hdd;
        this.ram = ram;
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.bhuwan.designpatterns.creational.abstractfactory.Computer#getRam()
     */
    @Override
    public String getRam() {
        return this.ram;
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.bhuwan.designpatterns.creational.abstractfactory.Computer#getHdd()
     */
    @Override
    public String getHdd() {
        return this.hdd;
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.bhuwan.designpatterns.creational.abstractfactory.Computer#getCpu()
     */
    @Override
    public String getCpu() {
        return this.cpu;
    }

}
