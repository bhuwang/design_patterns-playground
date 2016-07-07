/**
 * 
 */
package com.bhuwan.designpatterns.structural.adapter;

/**
 * Using inheritance for adapter pattern
 * 
 * @author bhuwan
 *
 */
public class SocketClassAdapterImpl extends Socket implements SocketAdapter {

    private Volt convertVolt(Volt v, int i) {
        return new Volt(v.getVolts() / i);
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.bhuwan.designpatterns.structural.adapter.SocketAdapter#get120Volt()
     */
    @Override
    public Volt get120Volt() {
        return getVolt();
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.bhuwan.designpatterns.structural.adapter.SocketAdapter#get12Volt()
     */
    @Override
    public Volt get12Volt() {
        Volt v = getVolt();
        return convertVolt(v, 10);
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.bhuwan.designpatterns.structural.adapter.SocketAdapter#get3Volt()
     */
    @Override
    public Volt get3Volt() {
        Volt v = getVolt();
        return convertVolt(v, 40);
    }

}
