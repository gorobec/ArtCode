package week8.timer;

import java.time.LocalTime;
import java.util.TimerTask;


public class Task extends TimerTask {

    @Override
    public void run() {
        System.out.println(LocalTime.now());
    }
}
