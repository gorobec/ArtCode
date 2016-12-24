package week3.day1;

import utils.ArrayUtils;

import java.util.Arrays;

/**
 * Created by gorobec on 24.12.16.
 */
public class _01StringIntro {
    public static void main(String[] args) {
        String name = "Yevhen";
        String surname = "Vorobiei";


        System.out.println(name.length());
        System.out.println(name.isEmpty());
        System.out.println(name.equals("Yevhen"));
        System.out.println(name.equalsIgnoreCase("yeVhen"));
        System.out.println(name.compareTo("Zoo"));
        System.out.println(name.substring(1, 3));
        System.out.println(name.substring(3));
        System.out.println(name);
        System.out.println(name.startsWith("Yev"));
        System.out.println(name.endsWith("n"));
        System.out.println(name.charAt(5));
        System.out.println(name.indexOf('e'));
        String[] words = "Hello, my name, is, Yevhen".split(", ");
        System.out.println(Arrays.toString(words));


    }
}
