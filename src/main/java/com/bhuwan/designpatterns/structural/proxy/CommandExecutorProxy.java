/**
 * 
 */
package com.bhuwan.designpatterns.structural.proxy;

/**
 * @author bhuwan
 *
 */
public class CommandExecutorProxy implements CommandExecutor {

    private boolean isAdmin;
    private CommandExecutor executor = new CommandExecutorImpl();;

    public CommandExecutorProxy(String user, String pwd) {
        if ("username".equals(user) && "password".equals(pwd)) {
            isAdmin = Boolean.TRUE;
        }
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.bhuwan.designpatterns.structural.proxy.CommandExecutor#runCommand(java.lang.String)
     */
    @Override
    public void runCommand(String cmd) throws Exception {
        if (isAdmin) {
            executor.runCommand(cmd);
        } else {
            if (cmd.startsWith("rm")) {
                throw new Exception("rm command is not allowed for non-admin users");
            } else {
                executor.runCommand(cmd);
            }
        }
    }

}
