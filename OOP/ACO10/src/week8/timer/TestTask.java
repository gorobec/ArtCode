package week8.timer;

import java.util.Timer;

/**
 * Created by gorobec on 30.01.16.
 */
public class TestTask {
    public static void main(String[] args) throws InterruptedException {

        Task task = new Task();

        Timer timer = new Timer();

        timer.schedule(task, 1000, 1000);
        Thread.sleep(15000);
        timer.cancel();
    }
}
