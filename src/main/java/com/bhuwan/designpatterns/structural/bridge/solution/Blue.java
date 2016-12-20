/**
 * 
 */
package com.bhuwan.designpatterns.structural.bridge.solution;

/**
 * @author bhuwan
 *
 */
public class Blue implements Color {

    /*
     * (non-Javadoc)
     * 
     * @see com.bhuwan.designpatterns.structural.bridge.solution.Color#applyColor()
     */
    @Override
    public void applyColor() {
        System.out.println("applying blue color");
    }

}
