package week2.day2;

import utils.ArrayUtils;

/**
 * Created by gorobec on 11.09.16.
 */
public class _01ChangeByLink {
    public static void main(String[] args) {
        int[] array = ArrayUtils.createArray(10);


        int[] arrayCopy = array;


        array[5] = 13;

        System.out.println(array[5]);
        System.out.println(arrayCopy[5]);
    }
}
