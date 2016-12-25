/**
 * 
 */
package com.bhuwan.designpatterns.behaviour.interpreter.rulevalidator;

import java.util.StringTokenizer;

/**
 * @author bhuwan
 *
 */
public class TerminalExpression implements Expression {

    private String data;

    public TerminalExpression(String data) {
        this.data = data;
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.bhuwan.designpatterns.behaviour.interpreter.rulevalidator.Expression#interpret(java.lang.String)
     */
    @Override
    public boolean interpret(String str) {
        StringTokenizer st = new StringTokenizer(str);
        while (st.hasMoreTokens()) {
            if (st.nextToken().equals(data)) {
                return true;
            }
        }
        return false;
    }

}
