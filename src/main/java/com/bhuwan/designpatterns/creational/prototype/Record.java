/**
 * 
 */
package com.bhuwan.designpatterns.creational.prototype;

/**
 * @author bhuwan
 *
 */
public class Record {

    int i;

    Record(int i) {
        this.i = i;
    }

    @Override
    public String toString() {
        return "[i: " + i + "]";
    }
}
