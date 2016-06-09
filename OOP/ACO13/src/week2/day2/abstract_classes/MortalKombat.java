package week2.day2.abstract_classes;

/**
 * Created by gorobec on 29.05.16.
 */
public class MortalKombat {
    public static void main(String[] args) {
        Fighter f1 = new LukKang("Luck", 20);
        Fighter f2 = new Subzero("Sub", 15);


        Arena arena = new Arena(f1, f2);
        arena.startFight();
    }
}
