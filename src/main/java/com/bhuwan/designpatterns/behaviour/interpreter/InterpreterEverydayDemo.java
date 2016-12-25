/**
 * 
 */
package com.bhuwan.designpatterns.behaviour.interpreter;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author bhuwan
 *
 */
public class InterpreterEverydayDemo {

    /**
     * @param args
     */
    public static void main(String[] args) {
        String input = "Lions, and tigers, and bears! Oh, my!";

        Pattern p = Pattern.compile("(lion|cat|dog|wolf|bear|human|tiger|lion|Lion)");
        Matcher m = p.matcher(input);

        while (m.find()) {
            System.out.println("Found a " + m.group() + ".");
        }
    }

}
