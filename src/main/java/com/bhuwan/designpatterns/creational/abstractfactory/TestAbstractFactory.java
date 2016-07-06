/**
 * 
 */
package com.bhuwan.designpatterns.creational.abstractfactory;

/**
 * @author bhuwan
 *
 */
public class TestAbstractFactory {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Computer pc = ComputerFactory.getComputer(new PCFactory("4GB", "500GB", "Core 2 Duo"));
        Computer server = ComputerFactory.getComputer(new ServerFactory("16GB", "8 Cores", "1TB"));

        System.out.println("PC Configuration:");
        System.out.println(pc);

        System.out.println();
        System.out.println("Server Configuration");
        System.out.println(server);
    }

}
