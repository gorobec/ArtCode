package week3.time_action;

import utils.TimeAction;
import utils.TimeCounter;


public class TimerTest {
    public static void main(String[] args) {
        long time = new TimeCounter().countEvent(new MyAction());
        System.out.println(time);
    }
}
class MyAction implements TimeAction {
    @Override
    public void callAction() {
        int count = 0;
        for (int i = 0; i < 1_000_000_000; i++) {
            count++;
        }
        System.out.println(count);
   }
}
