/**
 * 
 */
package com.bhuwan.designpatterns.behaviour.command;

/**
 * @author bhuwan
 *
 */
public class CommandEverydayDemo {

    public static void main(String[] args) {
        // encapsulates request
        Task task1 = new Task(10, 12);
        Task task2 = new Task(11, 13);

        Thread thread1 = new Thread(task1);
        Thread thread2 = new Thread(task2);

        // invoker
        thread1.start();
        thread2.start();
    }
}

class Task implements Runnable {

    int num1;
    int num2;

    public Task(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    /*
     * This acts as an execute method for command
     */
    @Override
    public void run() {
        // receiver
        System.out.println(num1 * num2);
    }

}
