/**
 * 
 */
package com.bhuwan.designpatterns.structural.proxy;

import java.io.IOException;

/**
 * @author bhuwan
 *
 */
public class CommandExecutorImpl implements CommandExecutor {

    /*
     * (non-Javadoc)
     * 
     * @see com.bhuwan.designpatterns.structural.proxy.CommandExecutor#runCommand(java.lang.String)
     */
    @Override
    public void runCommand(String cmd) throws IOException {
        Runtime.getRuntime().exec(cmd);
        System.out.println("'" + cmd + "' executed successfully!");
    }

}
