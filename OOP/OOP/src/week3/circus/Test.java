package week3.circus;


import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        Director director = new Director();
        Artist acrobat = new Acrobat("Jack", 25);
        Artist acrobat2 = new Acrobat("Michale", 18);
        Artist clown = new Clown("Crasty", 26);
        Artist clown2 = new Clown("Nikylin", 90);
        Artist handler = new Handler("Jane", 29);
        Artist handler2 = new Handler("Jake", 19);
        Artist magician = new Magician("Coperfild", 40);
        Artist magician2 = new Magician("Tricker", 34);

        director.showArtists();

        director.hireNewArtist(acrobat);
        director.hireNewArtist(clown);
        director.hireNewArtist(clown2);
        director.hireNewArtist(magician);
        director.hireNewArtist(handler);

        director.showArtists();

        director.hireNewArtist(acrobat2);

        director.paySalary(3500);

        System.out.println(acrobat.getSalary());
        System.out.println(acrobat2.getSalary());
        System.out.println(clown.getSalary());

        director.sendToAct(acrobat2);
        director.sendToAct(acrobat2);

        System.out.println(director.actingTimes(acrobat2));

        director.fireMostDrunkAcrobat();

        director.showArtists();





    }
}
