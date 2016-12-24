/**
 * 
 */
package com.bhuwan.designpatterns.behaviour.chainofresponsibility.solution;

/**
 * @author bhuwan
 *
 */
public class Director extends Handler {

    /*
     * (non-Javadoc)
     * 
     * @see com.bhuwan.designpatterns.behaviour.chainofresponsibility.solution.Handler#handleRequest(com.bhuwan.designpatterns.behaviour.
     * chainofresponsibility.solution.Request)
     */
    @Override
    public void handleRequest(Request request) {
        if (request.getRequestType().equals(RequestType.CONFERENCE)) {
            System.out.println("Directors can approve");
        } else {
            successor.handleRequest(request);
        }
    }
}
