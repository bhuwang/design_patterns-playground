/**
 * 
 */
package com.bhuwan.designpatterns.behaviour.chainofresponsibility.solution;

/**
 * @author bhuwan
 *
 */
public class Request {

    private RequestType requestType;
    private double amount;

    public Request(RequestType requestType, double amount) {
        this.requestType = requestType;
        this.amount = amount;
    }

    /**
     * @return the requestType
     */
    public RequestType getRequestType() {
        return requestType;
    }

    /**
     * @return the amount
     */
    public double getAmount() {
        return amount;
    }

}
