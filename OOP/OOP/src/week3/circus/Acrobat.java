package week3.circus;

import java.io.Serializable;
import java.util.Comparator;
import java.util.Random;

public class Acrobat extends Artist implements Comparable<Acrobat>, Comparator<Acrobat>, Serializable {
    private int drunkLevel = (int)(new Random().nextDouble() *100);


    public Acrobat(String name, int age) {
        super(name, age);
    }

    public int getDrunkLevel() {
        return drunkLevel;
    }
    @Override
    public void acting() {
        System.out.println("Making tricks...");
        this.setActionTimes(this.getActionTimes() + 1);
    }

    @Override
    public int compareTo(Acrobat acrobat) {
        return this.drunkLevel > acrobat.drunkLevel ? 1 : this.drunkLevel == acrobat.drunkLevel ? 0 : -1;
    }

    @Override
    public int compare(Acrobat acrobat1, Acrobat acrobat2) {
        return acrobat1.drunkLevel > acrobat2.drunkLevel ? 1 : acrobat1.drunkLevel == acrobat2.drunkLevel ? 0 : -1;
    }
}
