package week3.day2.time_counting;

public class TimeCounter {

    public long countAction(Action action){
        long start = System.currentTimeMillis();
        action.runAction();
        long finish = System.currentTimeMillis();
        return finish - start;
    }
}
