package week3.day2.interfaces;

/**
 * Created by gorobec on 20.12.15.
 */
public class Duck implements Swimmable, Flyable, Walkable {
    @Override
    public void swimm() {
        System.out.println("I can swimm, cause I have membranes");
    }

    @Override
    public void fly() {
        System.out.println("I can fly, cause I have wings");

    }

    @Override
    public void walk() {
        System.out.println("I can walk, cause I have feet");

    }
}
