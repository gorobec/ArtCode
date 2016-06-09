package week3.day1;

import java.util.Scanner;

/**
 * Created by gorobec on 30.01.16.
 */
public class StringMethodsPart2 {
    public static void main(String[] args) {
        String text = "  Hello my name is Jenja!  ";
        text = text.trim();
        String[] words = text.split(" ");
        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }

     /*   Scanner sc = new Scanner(System.in);
//        sc.useDelimiter("d");
        while (sc.hasNext()) {
            System.out.println(sc.next());
        }*/
        int start = text.indexOf('m');
        int end = text.indexOf('e', 2);
        String newText = text.substring(start, ++end);
        System.out.println(newText);
        text =  text.replace('e', 'E');
        System.out.println(text);
        System.out.println(text.length());
        char[] letters = text.toCharArray();
        for (int i = 0; i < letters.length; i++) {
            if(letters[i] == 'E')
                letters[i] = 'e';
        }
        String newLetters = new String(letters);
        System.out.println(newLetters);
    }
}
