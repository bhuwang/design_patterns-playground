/**
 * 
 */
package com.bhuwan.designpatterns.creational.builder;

/**
 * @author bhuwan
 *
 */
public class TestBuilder {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Computer com1 = new Computer.ComputerBuilder("4GB", "Core 2 Duo", "40GB").build();
        Computer com2 = new Computer.ComputerBuilder("4GB", "Core 2 Duo", "40GB").isGraphicsCardEnabled(true).build();
        Computer com3 = new Computer.ComputerBuilder("4GB", "Core 2 Duo", "40GB").isBloothEnabled(true).build();

        System.out.println(com1);
        System.out.println(com2);
        System.out.println(com3);

    }

}
