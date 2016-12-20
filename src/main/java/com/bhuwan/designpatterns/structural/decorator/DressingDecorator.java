/**
 * 
 */
package com.bhuwan.designpatterns.structural.decorator;

/**
 * @author bhuwan
 *
 */
public class DressingDecorator extends SandwichDecorator {

    public DressingDecorator(Sandwich customSandwich) {
        super(customSandwich);
    }

    @Override
    public String make() {
        return customSandwich.make() + addDressing();
    }

    private String addDressing() {
        return " + Mustard";
    }

}
