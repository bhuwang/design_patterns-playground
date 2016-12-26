/**
 * 
 */
package com.bhuwan.designpatterns.behaviour.mediator.solution;

/**
 * Receiver class
 * 
 * @author bhuwan
 *
 */
public class Light {

    private boolean isOn = false;
    private String location = "";

    public Light() {

    }

    Light(String location) {
        this.location = location;
    }

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
