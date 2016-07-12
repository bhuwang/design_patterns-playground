/**
 * 
 */
package com.bhuwan.designpatterns.behaviour.template;

/**
 * @author bhuwan
 *
 */
public class TestTempate {

    /**
     * @param args
     */
    public static void main(String[] args) {
        HouseTemplate house = new WoodenHouse();
        house.buildHouse();

        System.out.println();
        house = new GlassHouse();
        house.buildHouse();
    }

}
