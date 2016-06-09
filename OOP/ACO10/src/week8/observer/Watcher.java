package week8.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by gorobec on 30.01.16.
 */
public class Watcher implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        System.out.println(arg);
    }
}
