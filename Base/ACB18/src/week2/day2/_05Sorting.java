package week2.day2;

import utils.ArrayUtils;

/**
 * Created by gorobec on 11.09.16.
 */
public class _05Sorting {
    public static void main(String[] args) {
        int[] numbers = {7, 6, 2, 4, 5};

        int tmp;
        tmp = numbers[2];
        numbers[2] = numbers[1];
        numbers[1] = tmp;

        ArrayUtils.printArray(numbers);
    }
}
