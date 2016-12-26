/**
 * 
 */
package com.bhuwan.designpatterns.behaviour.mediator;

import java.util.Timer;
import java.util.TimerTask;

/**
 * @author bhuwan
 *
 */
public class MediatorEverydayDemo {

    private Timer timer;

    public MediatorEverydayDemo(int seconds) {
        timer = new Timer();
        timer.schedule(new RemindTask(), seconds * 1_000);
        timer.schedule(new RandomTaskWithoutBeep(), seconds * 2 * 1_000);
    }

    class RemindTask extends TimerTask {

        @Override
        public void run() {
            System.out.println("Time's up!");
        }

    }

    class RandomTaskWithoutBeep extends TimerTask {

        @Override
        public void run() {
            System.out.println("TIme's really up!");
            timer.cancel();
        }

    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("About to schedule a task");
        new MediatorEverydayDemo(5);
        System.out.println("Task scheduled");
    }

}
