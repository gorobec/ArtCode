package week3.day1;

import utils.ArrayUtils;

/**
 * Created by gorobec on 23.04.16.
 */
public class _01StringCreation {
    public static void main(String[] args) {
//        1
        String name = "Jenja";
        int[] array = {1, 2, 3, 4, 5};
        System.out.println(name);
        System.out.println(array);
        char[] letters = {'a', 'b', 'c'};
        System.out.println(letters);
//        2
        String word = new String(letters);
//        3
        String name2 = new String("Jenja");
    }
}
