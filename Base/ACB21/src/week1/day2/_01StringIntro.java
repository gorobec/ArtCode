package week1.day2;

/**
 * Created by gorobec on 04.12.16.
 */
public class _01StringIntro {
    public static void main(String[] args) {
        String name = "Jenja";

        String name2 = new String("Jenja");

        String name3 = "Jenja";


        System.out.println("name == name2 " + (name == name2));
        System.out.println("name == name3 " + (name == name3));
        System.out.println("name.equals(name2) " + name.equals(name2));
        System.out.println("name.equals(name3) " + name.equals(name3));



    }
}
