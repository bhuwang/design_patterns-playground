/**
 * 
 */
package com.bhuwan.designpatterns.behaviour.chainofresponsibility.solution;

/**
 * @author bhuwan
 *
 */
public abstract class Handler {

    protected Handler successor;

    public void setSuccessor(Handler succcessor) {
        this.successor = succcessor;
    }

    public abstract void handleRequest(Request request);
}
