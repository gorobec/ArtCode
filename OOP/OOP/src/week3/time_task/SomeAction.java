package week3.time_task;



import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimerTask;

public class SomeAction extends TimerTask {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.printf("Current time is %s\n", new SimpleDateFormat("HH:mm:ss").format(new Date()));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
