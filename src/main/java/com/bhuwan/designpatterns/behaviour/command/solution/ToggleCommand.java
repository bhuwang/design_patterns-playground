package com.bhuwan.designpatterns.behaviour.command.solution;

/**
 * Concrete command class
 * 
 * 
 * @author bhuwan
 *
 */
public class ToggleCommand implements Command {

    private Light light;

    public ToggleCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.toggle();
    }

}
