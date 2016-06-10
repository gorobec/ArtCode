package week3.observed;

import java.util.Observer;


public class ObserveTest {
    public static void main(String[] args) throws InterruptedException {
        Observer observer = new MyObserver();
        MyBeingObserved observable = new MyBeingObserved();
        observable.addObserver(observer);
        observable.act();
    }
}
