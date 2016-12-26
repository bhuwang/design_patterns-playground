/**
 * 
 */
package com.bhuwan.designpatterns.behaviour.mediator.solution;

/**
 * @author bhuwan
 *
 */
public class TurnOffAllLightsCommand implements Command {

    private Mediator med;

    public TurnOffAllLightsCommand(Mediator med) {
        this.med = med;
    }

    @Override
    public void execute() {
        med.turnOffAllLights();
    }

}
