package week3.day1;

/**
 * Created by gorobec on 30.01.16.
 */
public class Wrappers {
    public static void main(String[] args) {
        int i = 15;
        Integer integer = i;
        int b = Integer.parseInt("5");
        char a = 'A';
        Character c = a;
        char g = Character.toUpperCase('g');
        System.out.println(g);
        b *= 3;
        System.out.println(b);
    }
}
