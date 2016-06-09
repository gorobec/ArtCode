package week4.final_word;


public class City {
    private NuclearStation nuclearStation;

    public City(NuclearStation nuclearStation) {
        this.nuclearStation = nuclearStation;
    }
    public void startWorkday(){
        nuclearStation.start(150, 1000);
    }
}
