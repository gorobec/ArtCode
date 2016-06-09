package week4.final_word;

public class TestCity {
    public static void main(String[] args) {
        NuclearStation station = new NuclearStation(500, 750);
//        NuclearStation chernobyl = new Chernobyl(500, 700);
        City kiev = new City(station);
        kiev.startWorkday();

    }
}
