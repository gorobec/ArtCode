package week8.observer;

import java.util.Observable;

/**
 * Created by gorobec on 30.01.16.
 */
public class BeingWatch extends Observable {

    public void act() throws InterruptedException {
        for (int i = 0; i < 20; i++) {
            Thread.sleep(1000);
            setChanged();
            notifyObservers(i);
        }


    }

}
