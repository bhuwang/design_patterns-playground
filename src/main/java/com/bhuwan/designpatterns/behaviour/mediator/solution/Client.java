/**
 * 
 */
package com.bhuwan.designpatterns.behaviour.mediator.solution;

/**
 * @author bhuwan
 *
 */
public class Client {

    public static void main(String[] args) {
        Mediator mediator = new Mediator();
        Light bedroomLight = new Light("Bedroom");
        Light kitchenLight = new Light("Kitchen");

        mediator.registerLight(kitchenLight);
        mediator.registerLight(bedroomLight);

        Command turnOnAllLightsCommand = new TurnOnAllLightsCommand(mediator);
        turnOnAllLightsCommand.execute();

        Command turnOffAllLightsCommand = new TurnOffAllLightsCommand(mediator);
        turnOffAllLightsCommand.execute();
    }
}
