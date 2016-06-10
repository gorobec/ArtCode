package week3.circus;

public interface IDirector {
    void showArtists();
    boolean hireNewArtist(Artist artist);
    boolean fireMostDrunkAcrobat();
    boolean sendToAct(Artist artist);
    int actingTimes(Artist artist);
    boolean paySalary(long salary);
    boolean changeLocation(String town);
}
