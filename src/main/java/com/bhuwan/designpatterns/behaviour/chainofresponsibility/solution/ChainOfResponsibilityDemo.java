/**
 * 
 */
package com.bhuwan.designpatterns.behaviour.chainofresponsibility.solution;

/**
 * @author bhuwan
 *
 */
public class ChainOfResponsibilityDemo {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Director chris = new Director();
        VP richan = new VP();
        CEO himal = new CEO();

        chris.setSuccessor(richan);
        richan.setSuccessor(himal);

        Request request = new Request(RequestType.CONFERENCE, 500);
        chris.handleRequest(request);

        request = new Request(RequestType.PURCHASE, 1000);
        chris.handleRequest(request);

        request = new Request(RequestType.PURCHASE, 2000);
        chris.handleRequest(request);
    }

}
