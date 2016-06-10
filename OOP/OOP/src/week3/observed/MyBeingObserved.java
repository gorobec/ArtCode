package week3.observed;

import java.util.Observable;

public class MyBeingObserved extends Observable {
    public void act() throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            setChanged();
            notifyObservers(i);
            Thread.sleep(1000);

        }
    }
}
