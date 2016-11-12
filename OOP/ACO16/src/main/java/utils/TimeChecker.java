package utils;

/**
 * Created by gorobec on 12.11.16.
 */
public class TimeChecker {
    public static long checkTime(Action action){
        long start = System.currentTimeMillis();
//        action
        action.run();
        long end = System.currentTimeMillis();
        return end - start;
    }
}
