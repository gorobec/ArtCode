package week5.clone;

/**
 * Created by gorobec on 05.11.16.
 */
public class TestClone {
    public static void main(String[] args) throws CloneNotSupportedException {
        Man man = new Man("Adam", 25);
        Woman woman = new Woman("Eva", 30);
        Child  child = new Child("Abel", 15);
        woman.setChild(child);
        man.setWife(woman);

        Man clone = man.clone();

        System.out.println("Man - " + man);
        System.out.println("Clone - " + clone);

        man.setName("Jack");

        System.out.println("***********");

        System.out.println("Man after change name - " + man);
        System.out.println("Clone after change man's name - " + clone);

        System.out.println("***********");

        woman.setName("Angelika");


        System.out.println("Man after women change name - " + man);
        System.out.println("Clone after change women name - " + clone);

        System.out.println("**********");

        man.getWife().getChild().setName("Kain");

        System.out.println("Man after child change name - " + man);
        System.out.println("Clone after change child name - " + clone);


    }
}
