/**
 * 
 */
package com.bhuwan.designpatterns.behaviour.template;

/**
 * @author bhuwan
 *
 */
public class GlassHouse extends HouseTemplate {

    /*
     * (non-Javadoc)
     * 
     * @see com.bhuwan.designpatterns.behaviour.template.HouseTemplate#buildWalls()
     */
    @Override
    public void buildWalls() {
        System.out.println("Building walls for glass house");
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.bhuwan.designpatterns.behaviour.template.HouseTemplate#buildPillars()
     */
    @Override
    public void buildPillars() {
        System.out.println("Building pillars for glass house");
    }

}
