/**
 * 
 */
package com.bhuwan.designpatterns.structural.adapter;

/**
 * @author bhuwan
 *
 */
public class Socket {

    public Volt getVolt() {
        return new Volt(120);
    }
}
