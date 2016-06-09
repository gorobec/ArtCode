package week3.day1;

import utils.ArrayUtils;

/**
 * Created by gorobec on 04.06.16.
 */
public class _04TestSort {
    public static void main(String[] args) {
        int[] numbers = ArrayUtils.createRandomArray(10, 0, 100);
        ArrayUtils.printArray(numbers);
        ArrayUtils.sort(numbers);
        ArrayUtils.printArray(numbers);

    }
}
