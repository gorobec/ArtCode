package week2.day1.circus;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * Created by gorobec on 15.10.16.
 */
public class Circus {
    private String name;
    private ArrayList<Artist> artists = new ArrayList<>();
    private ArrayList<RopeWalking> ropeWalkers = new ArrayList<>();

    public Circus(String name) {
        this.name = name;
    }

    public boolean addArtist(Artist artist){
        return artists.add(artist);
    }

    public void startPerformance(){
        for (Artist artist : artists) {
            artist.act();
        }
    }

    public void sort(Comparator comparator){
        artists.sort(comparator);
    }

    public boolean hireRopeWalker(RopeWalking ropeWalking){
        return ropeWalkers.add(ropeWalking);
    }
}
