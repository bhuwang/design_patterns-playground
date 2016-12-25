/**
 * 
 */
package com.bhuwan.designpatterns.behaviour.interpreter.rulevalidator;

/**
 * @author bhuwan
 *
 */
public class InterperterDemo {

    static Expression buildInterpreterTree() {

        TerminalExpression lions = new TerminalExpression("Lions");
        TerminalExpression tigers = new TerminalExpression("Tigers");
        TerminalExpression bears = new TerminalExpression("Bears");

        // Tigers and Bears
        Expression exp1 = new AndExpression(tigers, bears);

        // Lions or (Tigers and Bears)
        Expression exp2 = new OrExpression(lions, exp1);

        return new AndExpression(bears, exp2);
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        // String context = "Lions";
        // String context = "Bears";
        String context = "Tigers Bears";
        // String context = "Lions Bears";
        // String context = "Lions Tigers";
        Expression define = buildInterpreterTree();
        System.out.println(context + " is " + define.interpret(context));
    }

}
