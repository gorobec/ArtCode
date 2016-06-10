package utils;


public class TimeCounter {

    public long countEvent(TimeAction timeAction){
        long start = System.currentTimeMillis();
        timeAction.callAction();
        long finished = System.currentTimeMillis();
        return finished - start;
    }
}
