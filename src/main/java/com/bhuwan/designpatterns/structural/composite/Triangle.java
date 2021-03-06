/**
 * 
 */
package com.bhuwan.designpatterns.structural.composite;

/**
 * @author bhuwan
 *
 */
public class Triangle implements Shape {

    /*
     * (non-Javadoc)
     * 
     * @see com.bhuwan.designpatterns.structural.composite.Shape#draw(java.lang.String)
     */
    @Override
    public void draw(String fillColor) {
        System.out.println("Drawing Triangle with color: " + fillColor);
    }

}
