package week2.day1;

import utils.ArrayUtils;

import java.util.Arrays;

/**
 * Created by gorobec on 10.09.16.
 */
public class _12MethodsIntro {
    public static void main(String[] args) {

        int[] array = ArrayUtils.createArray(15);

        ArrayUtils.printArray(array);

        ArrayUtils.printArray(ArrayUtils.createRandomArray(15, 25, 300));
        System.out.println(Arrays.toString(array));
    }
}
