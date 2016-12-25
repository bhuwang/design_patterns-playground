/**
 * 
 */
package com.bhuwan.designpatterns.behaviour.command.solution;

import java.util.List;

/**
 * Concrete implementation
 * 
 * @author bhuwan
 *
 */
public class AllLightsCommand implements Command {

    private List<Light> lights;

    public AllLightsCommand(List<Light> lights) {
        this.lights = lights;
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.bhuwan.designpatterns.behaviour.command.solution.Command#execute()
     */
    @Override
    public void execute() {
        for (Light light : lights) {
            light.toggle();
        }
    }

}
