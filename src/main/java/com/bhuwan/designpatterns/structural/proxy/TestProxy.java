/**
 * 
 */
package com.bhuwan.designpatterns.structural.proxy;

/**
 * @author bhuwan
 *
 */
public class TestProxy {

    /**
     * @param args
     */
    public static void main(String[] args) {
        CommandExecutor executor = new CommandExecutorProxy("username", "wrong");
        try {
            executor.runCommand("ls");
            executor.runCommand("rm test");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
