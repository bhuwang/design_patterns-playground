/**
 * 
 */
package com.bhuwan.designpatterns.behaviour.chainofresponsibility;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author bhuwan
 *
 */
public class COREverydayDemo {

    private static final Logger logger = Logger.getLogger(COREverydayDemo.class.getName());

    /**
     * @param args
     */
    public static void main(String[] args) {
        logger.setLevel(Level.FINE);

        ConsoleHandler handler = new ConsoleHandler();
        handler.setLevel(Level.FINE);
        logger.addHandler(handler);

        logger.finest("Finest level of logging");
        logger.fine("Fine level of logging");
        logger.finer("Finer level of logging");
    }

}
