/**
 * 
 */
package com.bhuwan.designpatterns.structural.adapter;

/**
 * Adapter design pattern is one of the structural design pattern and its used so that two unrelated interfaces can work together. The
 * object that joins these unrelated interface is called an Adapter.
 * 
 * java:
 * 
 * @author bhuwan
 *
 */
public class TestAdapter {

    /**
     * @param args
     */
    public static void main(String[] args) {
        testObjectAdapter();
        testClassAdapter();
    }

    private static void testObjectAdapter() {
        SocketAdapter adapter = new SocketObjectAdapterImpl();
        Volt v3 = getVolt(adapter, 3);
        Volt v12 = getVolt(adapter, 12);
        Volt v120 = getVolt(adapter, 120);

        System.out.println(v3);
        System.out.println(v12);
        System.out.println(v120);
    }

    private static void testClassAdapter() {

        SocketAdapter adapter = new SocketClassAdapterImpl();
        Volt v3 = getVolt(adapter, 3);
        Volt v12 = getVolt(adapter, 12);
        Volt v120 = getVolt(adapter, 120);

        System.out.println(v3);
        System.out.println(v12);
        System.out.println(v120);

    }

    private static Volt getVolt(SocketAdapter sockAdapter, int i) {
        switch (i) {
        case 3:
            return sockAdapter.get3Volt();
        case 12:
            return sockAdapter.get12Volt();
        case 120:
            return sockAdapter.get120Volt();
        default:
            return sockAdapter.get120Volt();
        }
    }
}
