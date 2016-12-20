/**
 * 
 */
package com.bhuwan.designpatterns.structural.bridge.problem;

/**
 * @author bhuwan
 *
 */
public class BridgeDemoOne {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Circle redCircle = new RedCircle();
        Circle blueCircle = new BlueCircle();
        Square redSquare = new RedSquare();
        Square greenSquare = new GreenSquare();

        redCircle.applyColor();
        blueCircle.applyColor();

        redSquare.applyColor();
        greenSquare.applyColor();

    }

}
