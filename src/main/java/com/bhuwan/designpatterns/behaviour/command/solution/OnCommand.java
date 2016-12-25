/**
 * 
 */
package com.bhuwan.designpatterns.behaviour.command.solution;

/**
 * Concrete command class
 * 
 * @author bhuwan
 *
 */
public class OnCommand implements Command {

    private Light light;

    public OnCommand(Light light) {
        this.light = light;
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.bhuwan.designpatterns.behaviour.command.solution.Command#execute()
     */
    @Override
    public void execute() {
        light.on();
    }

}
