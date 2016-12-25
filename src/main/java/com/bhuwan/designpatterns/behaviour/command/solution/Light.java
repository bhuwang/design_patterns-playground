/**
 * 
 */
package com.bhuwan.designpatterns.behaviour.command.solution;

/**
 * Receiver class
 * 
 * @author bhuwan
 *
 */
public class Light {

    private boolean isOn = false;

    public boolean isOn() {
        return isOn;
    }

    public void toggle() {
        if (isOn) {
            off();
            isOn = !isOn;
        } else {
            on();
            isOn = !isOn;
        }
    }

    public void on() {
        System.out.println("Switched on");
    }

    public void off() {
        System.out.println("Switched off");
    }
}
