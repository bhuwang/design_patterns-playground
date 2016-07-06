/**
 * 
 */
package com.bhuwan.designpatterns.creational.factory;

/**
 * @author bhuwan
 *
 */
public class PC extends Computer {

    private String ram;
    private String hdd;
    private String cpu;

    public PC(String ram, String hdd, String cpu) {
        this.ram = ram;
        this.hdd = hdd;
        this.cpu = cpu;
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.bhuwan.designpatterns.creational.factory.Computer#getRam()
     */
    @Override
    public String getRam() {
        return this.ram;
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.bhuwan.designpatterns.creational.factory.Computer#getHdd()
     */
    @Override
    public String getHdd() {
        return this.hdd;
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.bhuwan.designpatterns.creational.factory.Computer#getCpu()
     */
    @Override
    public String getCpu() {
        return this.cpu;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "PC [ram=" + ram + ", hdd=" + hdd + ", cpu=" + cpu + "]";
    }

}
