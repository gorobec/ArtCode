package week3.circus;

import java.io.Serializable;
import java.util.ArrayList;

public class Director implements IDirector, Serializable {
    private Circus circus;
    private String name = "Smith";
    private long salary;
    private ArrayList<Artist>artists = new ArrayList<>();

    public Director() {
    }

    public Director(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void showArtists() {
        for (Artist artist : artists) {
            System.out.printf("%s", artist);
        }
    }

    @Override
    public boolean hireNewArtist(Artist artist) {
        if(artist == null) return false;
        if(findArtits(artist) != null){
            System.out.printf("%s has already works on you!", artist);
            return false;
        }
        this.artists.add(artist);
        System.out.printf("You've hired %s", artist);
        return true;
    }

    private Artist findArtits(Artist artist) {
        if(artist == null) return null;
        for (Artist yourArtists : artists) {
            if (artist.equals(yourArtists)) return artist;
        }
        return null;
    }

    @Override
    public boolean fireMostDrunkAcrobat() {
        ArrayList<Acrobat>  acrobats = findDrinkingAcrobats();
        if(acrobats.size() == 0){
            System.out.println("Your acrobats gave up drinking!");
            return false;
        }
        Acrobat mostDrunk = findMostDrunkAcrobat(acrobats);
        System.out.printf("You've fired the most drinking acrobat.\nIt was - %s", mostDrunk);
        return true;
    }

    private Acrobat findMostDrunkAcrobat(ArrayList<Acrobat> acrobats) {
        Acrobat mostDrunk = acrobats.get(0);
        for (int i = 1; i < acrobats.size(); i++) {
            if(mostDrunk.compareTo(acrobats.get(i)) < 1) mostDrunk = acrobats.get(i);
        }
        this.artists.remove(mostDrunk);
        return mostDrunk;
    }

    private ArrayList<Acrobat> findDrinkingAcrobats() {
        ArrayList<Acrobat> drinkers = new ArrayList<>();
        for (Artist artist : artists) {
            if(artist instanceof Acrobat && ((Acrobat) artist).getDrunkLevel() > 0) drinkers.add((Acrobat)artist);
        }
        return drinkers;
    }

    @Override
    public boolean sendToAct(Artist artist) {
        if(artist == null) return false;
        Artist myArtist = findArtitsByName(artist);
        if(myArtist == null) return false;
        myArtist.acting();
        return true;
    }

    private Artist findArtitsByName(Artist artist) {
        if(artist == null) return null;
        for (Artist yourArtists : artists) {
            if (artist.getName().equals(yourArtists.getName())) return artist;
        }
        return null;
    }

    @Override
    public int actingTimes(Artist artist) {
        if(artist == null) return 0;
        return artist.getActionTimes();
    }

    @Override
    public boolean paySalary(long money) {
        if(this.artists.size() == 0) {
            System.out.println("First hire someone!");
            return false;
        }
        for (Artist artist : artists) {
            artist.setSalary(money);
        }
        return true;
    }

    @Override
    public boolean changeLocation(String town) {
        this.circus.setLocation(town);
        return true;
    }
}
