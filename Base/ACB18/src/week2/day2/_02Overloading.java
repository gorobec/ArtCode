package week2.day2;

import utils.ArrayUtils;

/**
 * Created by gorobec on 11.09.16.
 */
public class _02Overloading {
    public static void main(String[] args) {
        int[] nums = ArrayUtils.createArray(10);
        ArrayUtils.printArray(nums);

        char[] symbols = {'a', 'b', 'c', 'd'};

//        ArrayUtils.printArray(symbols);
//        only for char[]
        System.out.println(symbols);
    }
}
