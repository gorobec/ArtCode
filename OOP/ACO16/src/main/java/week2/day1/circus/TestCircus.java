package week2.day1.circus;

/**
 * Created by gorobec on 15.10.16.
 */
public class TestCircus {
    public static void main(String[] args) {
        Circus circus = new Circus("Kobzov");
        Acrobat artist = new Acrobat("Acrobat");
        Clown artist2 = new Clown("Clown");

        circus.addArtist(artist);
        circus.addArtist(artist2);


        circus.startPerformance();



    }
}
