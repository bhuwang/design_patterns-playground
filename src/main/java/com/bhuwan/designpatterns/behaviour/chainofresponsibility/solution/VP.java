/**
 * 
 */
package com.bhuwan.designpatterns.behaviour.chainofresponsibility.solution;

/**
 * @author bhuwan
 *
 */
public class VP extends Handler {

    /*
     * (non-Javadoc)
     * 
     * @see com.bhuwan.designpatterns.behaviour.chainofresponsibility.solution.Handler#handleRequest(com.bhuwan.designpatterns.behaviour.
     * chainofresponsibility.solution.Request)
     */
    @Override
    public void handleRequest(Request request) {
        if (request.getRequestType().equals(RequestType.PURCHASE) && request.getAmount() < 1500) {
            System.out.println("VPs can approve purchase below 1500");
        } else {
            successor.handleRequest(request);
        }
    }

}
