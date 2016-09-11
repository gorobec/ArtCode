package week2.day2;

import utils.ArrayUtils;

/**
 * Created by gorobec on 11.09.16.
 */
public class _08StringIntro {
    public static void main(String[] args) {
//        1
        String name = "Jenja";
//        2
        char[] symb = {'J', 'a', 'c', 'k'};
        String name2 = new String(symb);
//        3
        String name3 = new String("Jenja");

        System.out.println(name.equals(name3));

        System.out.println(name.charAt(4));
        System.out.println(name.length());
        System.out.println(name.contains("Jen"));
        System.out.println(name.equalsIgnoreCase("jenja"));
        System.out.println(name.toLowerCase());
        name = name.toUpperCase();
        System.out.println(name);

        System.out.println("Apple".compareTo("Egg"));

        System.out.println(name.endsWith("JA"));
        System.out.println(name.startsWith("JEN"));
        System.out.println(name.lastIndexOf("E"));
        System.out.println(name.indexOf("E"));
        System.out.println(name.substring(1));
        System.out.println(name.substring(1, 3));
        name.isEmpty();
        char[] arr = name.toCharArray();
        System.out.println(arr.length);
        String info = "     info     ";
        System.out.println(info);
        info = info.trim();
        System.out.println(info);

        String text = "ASCII stands for American Standard Code" +
                "for Information Interchange. ";
        System.out.println(text);
        String[] words = text.split(" ");
        System.out.println(ArrayUtils.arrayToString(words));;
    }
}
