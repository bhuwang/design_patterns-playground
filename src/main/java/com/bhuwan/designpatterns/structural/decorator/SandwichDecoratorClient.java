/**
 * 
 */
package com.bhuwan.designpatterns.structural.decorator;

/**
 * @author bhuwan
 *
 */
public class SandwichDecoratorClient {

    public static void main(String[] args) {
        Sandwich sandwich = new DressingDecorator(new MeatDecorator(new SimpleSandwich()));

        // Sandwich sandwich = new DressingDecorator(new SimpleSandwich());
        System.out.println(sandwich.make());
    }
}
