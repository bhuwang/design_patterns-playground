/**
 * 
 */
package com.bhuwan.designpatterns.behaviour.template;

/**
 * @author bhuwan
 *
 */
public class WoodenHouse extends HouseTemplate {

    /*
     * (non-Javadoc)
     * 
     * @see com.bhuwan.designpatterns.behaviour.template.HouseTemplate#buildWalls()
     */
    @Override
    public void buildWalls() {
        System.out.println("Building walls for wooden house.......");
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.bhuwan.designpatterns.behaviour.template.HouseTemplate#buildPillars()
     */
    @Override
    public void buildPillars() {
        System.out.println("Building pillars for wooden house");
    }

}
