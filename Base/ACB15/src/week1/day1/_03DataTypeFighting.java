package week1.day1;

/**
 * Created by Gorobec on 09.04.2016.
 */
public class _03DataTypeFighting {
    public static void main(String[] args) {
        byte b = 127;
        int i = b;

        int age = 260;


//        casting
        byte newAge = (byte)age;

        System.out.println(newAge);

        char c = (char) age;
        System.out.println(c);
    }
}
