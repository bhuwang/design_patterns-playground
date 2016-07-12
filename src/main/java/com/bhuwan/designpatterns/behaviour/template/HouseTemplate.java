/**
 * 
 */
package com.bhuwan.designpatterns.behaviour.template;

/**
 * @author bhuwan
 *
 */
public abstract class HouseTemplate {

    // template method, final, so that subclasses can't override.
    public final void buildHouse() {
        buildFoundation();
        buildPillars();
        buildWalls();
        buildWindows();
        System.out.println("How is built");
    }

    // default implementation
    public void buildFoundation() {
        System.out.println("Building foundation..........");
    }

    public void buildWindows() {
        System.out.println("Building windows");
    }

    // methods to be implemented by subclasses
    public abstract void buildWalls();

    public abstract void buildPillars();
}
