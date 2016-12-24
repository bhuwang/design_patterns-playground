/**
 * 
 */
package com.bhuwan.designpatterns.behaviour.chainofresponsibility.solution;

/**
 * @author bhuwan
 *
 */
public class CEO extends Handler {

    /*
     * (non-Javadoc)
     * 
     * @see com.bhuwan.designpatterns.behaviour.chainofresponsibility.solution.Handler#handleRequest(com.bhuwan.designpatterns.behaviour.
     * chainofresponsibility.solution.Request)
     */
    @Override
    public void handleRequest(Request request) {
        System.out.println("CEO can approve anything they want.");
    }

}
