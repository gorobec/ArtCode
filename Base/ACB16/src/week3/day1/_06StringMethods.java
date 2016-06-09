package week3.day1;

import utils.ArrayUtils;

/**
 * Created by gorobec on 04.06.16.
 */
public class _06StringMethods {
    public static void main(String[] args) {
        String name = "     Dima     ";
        String name2 = "Dima";
        String name3 = new String("Dima");
/*//        not recommended
        System.out.println(name == name2);
        System.out.println(name == name3);*/

/*        System.out.println(name.equals(name3));

        System.out.println(name.compareTo(name3));*/

       /* String text = "Hello my name is Vova!";
        String[] words = text.split(" ");

        ArrayUtils.printArray(words);*/
/*
        String name4 = name.concat(name3);
        System.out.println(name4);*/

//        System.out.println(name.charAt(2));

//        System.out.println(name.contains("o"));

//        System.out.println(name.endsWith("a"));
//        System.out.println(name.startsWith("d"));

//        System.out.println(name.equalsIgnoreCase("dima"));

    /*    System.out.println(name.indexOf("i"));
        System.out.println(name.lastIndexOf("i"));*/

        name = name.trim();
//        System.out.println(name);


//        System.out.println(name.length());

        /*System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());*/


//        System.out.println(name.substring(1, 3));
//        System.out.println(name.substring(1));
        char[] symbols = name.toCharArray();
        ArrayUtils.printArray(symbols);


    }
}
