/**
 * 
 */
package com.bhuwan.designpatterns.behaviour.mediator.solution;

/**
 * Concrete command
 * 
 * 
 * @author bhuwan
 *
 */
public class TurnOnAllLightsCommand implements Command {
    private Mediator med;

    public TurnOnAllLightsCommand(Mediator med) {
        this.med = med;
    }

    @Override
    public void execute() {
        med.turnOnAllLights();
    }

}
