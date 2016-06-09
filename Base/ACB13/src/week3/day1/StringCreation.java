package week3.day1;

/**
 * Created by gorobec on 30.01.16.
 */
public class StringCreation {
    public static void main(String[] args) {
        String s = "Hello";
        char[] letters = {'H','e', 'l', 'l', 'o'};
        String s2 = new String(letters);
//        redundant
        String s3 = new String("Hello");

        System.out.println(s);
        System.out.println(s2);
        System.out.println(s3);

        System.out.println(letters);

    }
}
