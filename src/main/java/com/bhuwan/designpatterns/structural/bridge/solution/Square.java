/**
 * 
 */
package com.bhuwan.designpatterns.structural.bridge.solution;

/**
 * @author bhuwan
 *
 */
public class Square extends Shape {

    public Square(Color color) {
        super(color);
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.bhuwan.designpatterns.structural.bridge.solution.Shape#applyColor()
     */
    @Override
    public void applyColor() {
        color.applyColor();
    }

}
