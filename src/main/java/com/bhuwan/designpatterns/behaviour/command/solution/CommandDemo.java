/**
 * 
 */
package com.bhuwan.designpatterns.behaviour.command.solution;

import java.util.ArrayList;
import java.util.List;

/**
 * Client applicaiton
 * 
 * @author bhuwan
 *
 */
public class CommandDemo {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Light bedRoomLight = new Light();
        Light kitchenLight = new Light();
        Light gardenLight = new Light();
        Switch switchLight = new Switch();

        // Command on = new OnCommand(light);
        // switchLight.sotreAndExecute(on);

        // Command toggle = new ToggleCommand(light);
        // switchLight.sotreAndExecute(toggle);
        // switchLight.sotreAndExecute(toggle);
        // switchLight.sotreAndExecute(toggle);
        // switchLight.sotreAndExecute(toggle);

        List<Light> lights = new ArrayList<>();
        lights.add(gardenLight);
        lights.add(kitchenLight);
        lights.add(bedRoomLight);
        Command allLightsCommand = new AllLightsCommand(lights);
        switchLight.storeAndExecute(allLightsCommand);
    }

}
