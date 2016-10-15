package week2.day1.circus;

/**
 * Created by gorobec on 15.10.16.
 */
public class Clown extends Artist implements RopeWalking{

    public Clown(String name) {
        super(name);
    }

    @Override
    public void act() {
        System.out.println("I'm clown");
    }

    @Override
    public void ropeWalking() {

    }
}