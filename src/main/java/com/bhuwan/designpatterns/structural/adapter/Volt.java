/**
 * 
 */
package com.bhuwan.designpatterns.structural.adapter;

/**
 * @author bhuwan
 *
 */
public class Volt {

    private int volts;

    public Volt(int volt) {
        this.volts = volt;
    }

    /**
     * @return the volts
     */
    public int getVolts() {
        return volts;
    }

    /**
     * @param volts
     *            the volts to set
     */
    public void setVolts(int volts) {
        this.volts = volts;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "Volt [volts=" + volts + "]";
    }
}
