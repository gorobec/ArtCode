package week1.day2;

/**
 * Created by gorobec on 04.09.16.
 */
public class _09Equals {
    public static void main(String[] args) {
        String a = "Hello";
        String b = "Hello";
        String c = new String("Hello");

        System.out.println(a == b);
        System.out.println(a.equals(c));

    }
}
