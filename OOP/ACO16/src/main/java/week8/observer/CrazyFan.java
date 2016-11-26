package week8.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by gorobec on 26.11.16.
 */
public class CrazyFan implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        System.out.printf("%s POST: \"%s\"%n", o, arg);
    }
}
