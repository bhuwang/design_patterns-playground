/**
 * 
 */
package com.bhuwan.designpatterns.structural.decorator;

/**
 * @author bhuwan
 *
 */
public class SimpleSandwich implements Sandwich {

    /*
     * (non-Javadoc)
     * 
     * @see com.bhuwan.designpatterns.structural.decorator.Sandwich#make()
     */
    @Override
    public String make() {
        return "Simple Sandwich with bread";
    }

}
