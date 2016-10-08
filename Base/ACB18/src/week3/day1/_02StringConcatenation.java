package week3.day1;

import utils.ArrayUtils;

/**
 * Created by gorobec on 17.09.16.
 */
public class _02StringConcatenation {
    public static void main(String[] args) {
        int[] array = ArrayUtils.createArray(1000);
        System.out.println("Array created");
        System.out.println(ArrayUtils.arrayToStringUsingBuilder(array));
        System.out.println(ArrayUtils.arrayToString(array));
        int i = Integer.parseInt("8586");

    }
}
