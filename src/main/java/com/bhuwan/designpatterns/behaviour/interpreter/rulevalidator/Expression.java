/**
 * 
 */
package com.bhuwan.designpatterns.behaviour.interpreter.rulevalidator;

/**
 * @author bhuwan
 *
 */
public interface Expression {

    public boolean interpret(String context);
}
