/**
 * 
 */
package com.bhuwan.designpatterns.structural.bridge.solution;

/**
 * @author bhuwan
 *
 */
public class BridgeDemoTwo {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Color blue = new Blue();
        Color red = new Red();
        Color green = new Green();

        Shape blueCircle = new Circle(blue);
        Shape redCircle = new Circle(red);
        Shape greenCircle = new Circle(green);
        blueCircle.applyColor();
        redCircle.applyColor();
        greenCircle.applyColor();

        Shape blueSquare = new Square(blue);
        Shape redSquare = new Square(red);
        blueSquare.applyColor();
        redSquare.applyColor();

    }

}
