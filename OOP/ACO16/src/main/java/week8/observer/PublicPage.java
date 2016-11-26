package week8.observer;

import java.util.Observable;

/**
 * Created by gorobec on 26.11.16.
 */
public class PublicPage extends Observable {

    private String name = "Travolta";


    public void makePost(){
        setChanged();
        String post = "On vocation";
        notifyObservers(post);
    }


    @Override
    public String toString() {
        return name;
    }
}
