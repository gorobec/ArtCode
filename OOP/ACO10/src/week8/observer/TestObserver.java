package week8.observer;

/**
 * Created by gorobec on 30.01.16.
 */
public class TestObserver {
    public static void main(String[] args) throws InterruptedException {
        BeingWatch beingWatch = new BeingWatch();
        Watcher watcher = new Watcher();

        beingWatch.addObserver(watcher);
        beingWatch.act();



    }
}
