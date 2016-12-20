/**
 * 
 */
package com.bhuwan.designpatterns.structural.bridge.solution;

/**
 * @author bhuwan
 *
 */
public abstract class Shape {

    protected Color color;

    public Shape() {
    }

    public Shape(Color color) {
        this.color = color;
    }

    public abstract void applyColor();
}
