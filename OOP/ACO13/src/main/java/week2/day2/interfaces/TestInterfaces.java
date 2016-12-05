package week2.day2.interfaces;

/**
 * Created by gorobec on 29.05.16.
 */
public class TestInterfaces {
    public static void main(String[] args) {


        Walkable ant = new Ant();
        Flyable bird = new Bird();
        Swimmable fish = new Fish();

        Duck duck = new Duck();


        Ocean ocean = new Ocean(fish);
        Earth earth = new Earth(duck);
        Sky sky = new Sky(duck);
    }
}
