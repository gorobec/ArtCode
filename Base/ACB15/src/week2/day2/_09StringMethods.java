package week2.day2;

/**
 * Created by gorobec on 17.04.16.
 */
public class _09StringMethods {
    public static void main(String[] args) {
        int a = 5;
        int b = 5;
        System.out.println(a == b);

        String name = "Jenja";
        String name2 = "Jenja";
        System.out.println(name == name2);
        String name3 = new String("Jenja");
        System.out.println(name == name3);

        boolean answer = name.equals(name3);
        System.out.println(answer);
    }
}
