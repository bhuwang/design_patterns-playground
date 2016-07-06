/**
 * 
 */
package com.bhuwan.designpatterns.creational.factory;

/**
 * @author bhuwan
 *
 */
public class TestFactory {

    public static void main(String[] args) {
        Computer pc = ComputerFactory.getComputer(ComputerTypes.PC, "4GB", "500GB", "Core 2 Duo");
        Computer server = ComputerFactory.getComputer(ComputerTypes.SERVER, "16GB", "1TB", "8 Cores");
        System.out.println("PC Configuration: ");
        System.out.println(pc);

        System.out.println();
        System.out.println("Server Configuration: ");
        System.out.println(server);

    }
}
