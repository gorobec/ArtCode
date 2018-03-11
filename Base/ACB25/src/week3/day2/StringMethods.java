package week3.day2;

import java.util.Arrays;

/**
 * @author Yevhen Vorobiei
 * @since JDK 1.8
 */
public class StringMethods {
    public static void main(String[] args) {
        String name = "Yevhen";

        String name2 = "Hanna";

        System.out.println(name.equals(name2));

        System.out.println(name.length());

        String newString = name.toUpperCase();

        System.out.println(newString);

        System.out.println(name);

        System.out.println(newString.toLowerCase());

        System.out.println(name.indexOf('e'));
        System.out.println(name.indexOf('p'));
        System.out.println(name.lastIndexOf('e'));

        System.out.println(name.indexOf('e', 2));

        System.out.println(name.charAt(3));

        System.out.println(name.substring(3));
        System.out.println(name.substring(1, 5));

        System.out.println(name.contains("Hen"));
        System.out.println(name.equalsIgnoreCase("yevhen"));

        System.out.println(name.compareTo("Yez"));

        String text = "Hello my name is Yevhen";

        String[] words = text.split(" ");

        System.out.println(Arrays.toString(words));

        System.out.println(words.length);

        char[] letters = name.toCharArray();
        System.out.println(Arrays.toString(letters));

        System.out.println(name.isEmpty());
        System.out.println("".isEmpty());

        System.out.println(name.replace('e', 'a'));

        System.out.println(name.startsWith("Yev"));
        System.out.println(name.endsWith("Yev"));


    }
}
