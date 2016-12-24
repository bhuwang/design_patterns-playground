/**
 * 
 */
package com.bhuwan.designpatterns.creational.factory.computer;

/**
 * @author bhuwan
 *
 */
public abstract class Computer {

    public abstract String getRam();

    public abstract String getHdd();

    public abstract String getCpu();

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "Computer [getRam()=" + getRam() + ", getHdd()=" + getHdd() + ", getCpu()=" + getCpu() + "]";
    }

}
