/**
 * 
 */
package com.bhuwan.designpatterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author bhuwan
 *
 */
public class Drawing implements Shape {

    private List<Shape> shapes = new ArrayList<>();

    /*
     * (non-Javadoc)
     * 
     * @see com.bhuwan.designpatterns.structural.composite.Shape#draw(java.lang.String)
     */
    @Override
    public void draw(String fillColor) {
        for (Shape shape : shapes) {
            shape.draw(fillColor);
        }
    }

    // adding shape to drawing
    public void add(Shape s) {
        this.shapes.add(s);
    }

    // removing shape from drawing
    public void remove(Shape s) {
        this.shapes.remove(s);
    }

    // removing all the shapes
    public void clear() {
        System.out.println("Clearing all the shapes from the drawing...");
        shapes.clear();
    }
}
