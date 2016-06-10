package week3.time_task;

import java.util.Timer;
import java.util.TimerTask;

public class TestTimer {
    public static void main(String[] args) throws InterruptedException {
        TimerTask task = new SomeAction();
        Timer timer = new Timer();
        task.run();
//                  TimerTask task, long delay, long period
        timer.schedule(task, 1000, 1000);
        Thread.yield();
        timer.cancel();
    }
}
