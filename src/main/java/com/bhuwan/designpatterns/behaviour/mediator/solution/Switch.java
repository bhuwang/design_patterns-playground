/**
 * 
 */
package com.bhuwan.designpatterns.behaviour.mediator.solution;

/**
 * Invoker class
 * 
 * @author bhuwan
 *
 */
public class Switch {

    public void storeAndExecute(Command command) {
        command.execute();
    }
}
