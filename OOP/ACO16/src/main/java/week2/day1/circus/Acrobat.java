package week2.day1.circus;

/**
 * Created by gorobec on 15.10.16.
 */
public class Acrobat extends Artist{

    public Acrobat(String name) {
        super(name);
    }

    @Override
    public void act() {
        System.out.println("I'm acrobat");
    }
}
