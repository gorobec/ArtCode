package week3.day1;

import utils.ArrayUtils;

/**
 * Created by gorobec on 23.04.16.
 */
public class _02StringMethods {
    public static void main(String[] args) {
        int a = 5;
        int b = 5;
        System.out.println(a == b);

        String name = "Jenja";
        String name2 = "Jenja";
        String name3 = new String("Jenja");

        System.out.println(name == name2);
        System.out.println(name == name3);

        boolean isEqual = name.equals(name3);
//        System.out.println(name.equals(name3));
        System.out.println(isEqual);

        int length =  name.length();
//        System.out.println(length);
        System.out.println(name.length());

        String word = "Hello";
        String word2 = "HellO";
//        remember to rewrite or create new variable
        String substring = word.substring(2);
        System.out.println(substring);
//      [start, end)
        String substring2 = word.substring(0, 4);
        System.out.println(substring2);

        char[] letters = word.toCharArray();
        ArrayUtils.printArray(letters);

        System.out.println(word.toUpperCase());

        System.out.println(word.toLowerCase());

        char letter = word.charAt(3);
        System.out.println(letter);

        System.out.println(word.contains("llo"));

        System.out.println(word.startsWith("He"));

        System.out.println(word.endsWith("lo"));

        System.out.println(word.compareTo(word2));

        System.out.println(word.compareToIgnoreCase(word2));

        System.out.println(word.concat(" world!"));

        System.out.println(word.indexOf("l"));
        System.out.println(word.lastIndexOf("l"));

        System.out.println(word.trim());

        String sentence = "Hello, my name is Vova!";
        String[] words = sentence.split(" ");
        System.out.println(words[1]);


    }
}
