package week2.day1.circus;

/**
 * Created by gorobec on 15.10.16.
 */
public abstract class Artist {
    private String name;

    public Artist(String name) {
        this.name = name;
    }

    public abstract void act();

}
