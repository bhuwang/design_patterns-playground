/**
 * 
 */
package com.bhuwan.designpatterns.structural.decorator;

/**
 * @author bhuwan
 *
 */
public class MeatDecorator extends SandwichDecorator {

    public MeatDecorator(Sandwich customSandwich) {
        super(customSandwich);
    }

    @Override
    public String make() {
        return customSandwich.make() + addMeat();
    }

    private String addMeat() {
        return " + trukey";
    }

}
