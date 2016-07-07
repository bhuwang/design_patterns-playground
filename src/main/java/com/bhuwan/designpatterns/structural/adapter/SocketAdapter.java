/**
 * 
 */
package com.bhuwan.designpatterns.structural.adapter;

/**
 * @author bhuwan
 *
 */
public interface SocketAdapter {

    public Volt get120Volt();

    public Volt get12Volt();

    public Volt get3Volt();
}
