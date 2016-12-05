package week2.day2.interfaces;

/**
 * Created by gorobec on 29.05.16.
 */
public class Bird implements Flyable {
    @Override
    public void fly() {
        System.out.println("I can fly I have wings");
    }
}
