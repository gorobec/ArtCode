package week3.day1;

import utils.ArrayUtils;

/**
 * Created by gorobec on 23.04.16.
 */
public class _03TestStringSort {
    public static void main(String[] args) {
        String[] array = {"Zoo", "Apple","apple", "Orange", "Cinema"};
        ArrayUtils.printArray(array);
        ArrayUtils.bubbleSort(array);
        System.out.println("After sorting");
        ArrayUtils.printArray(array);
    }
}
