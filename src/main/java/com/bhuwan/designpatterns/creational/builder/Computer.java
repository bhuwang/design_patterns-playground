/**
 * 
 */
package com.bhuwan.designpatterns.creational.builder;

/**
 * @author bhuwan
 *
 */
public class Computer {

    // required properties
    private String ram;
    private String cpu;
    private String hdd;

    // optional properties
    private boolean isGraphicsCardEnabled;
    private boolean isBloothEnabled;

    private Computer(ComputerBuilder builder) {
        this.ram = builder.ram;
        this.cpu = builder.cpu;
        this.hdd = builder.hdd;
        this.isGraphicsCardEnabled = builder.isGraphicsCardEnabled;
        this.isBloothEnabled = builder.isBloothEnabled;
    }

    /*
     * Builder Class
     */
    public static class ComputerBuilder {
        // required properties
        private String ram;
        private String cpu;
        private String hdd;

        // optional properties
        private boolean isGraphicsCardEnabled;
        private boolean isBloothEnabled;

        // constructor using required fields
        public ComputerBuilder(String ram, String cpu, String hdd) {
            this.ram = ram;
            this.cpu = cpu;
            this.hdd = hdd;
        }

        public ComputerBuilder isGraphicsCardEnabled(boolean isGraphicsCardEnabled) {
            this.isGraphicsCardEnabled = isGraphicsCardEnabled;
            return this;
        }

        public ComputerBuilder isBloothEnabled(boolean isBloothEnabled) {
            this.isBloothEnabled = isBloothEnabled;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }

    }

    /**
     * @return the ram
     */
    public String getRam() {
        return ram;
    }

    /**
     * @return the cpu
     */
    public String getCpu() {
        return cpu;
    }

    /**
     * @return the hdd
     */
    public String getHdd() {
        return hdd;
    }

    /**
     * @return the isGraphicsCardEnabled
     */
    public boolean isGraphicsCardEnabled() {
        return isGraphicsCardEnabled;
    }

    /**
     * @return the isBloothEnabled
     */
    public boolean isBloothEnabled() {
        return isBloothEnabled;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "Computer [ram=" + ram + ", cpu=" + cpu + ", hdd=" + hdd + ", isGraphicsCardEnabled=" + isGraphicsCardEnabled
                + ", isBloothEnabled=" + isBloothEnabled + "]";
    }

}
