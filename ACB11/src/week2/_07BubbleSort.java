package week2;

import utils.ArrayUtils;

/**
 * Created by gorobec on 25.10.15.
 */
public class _07BubbleSort {

    public static void main(String[] args) {
        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int)(25 + Math.random()*(101 - 25));
        }

        ArrayUtils.printArrayInt(numbers);

        numbers = ArrayUtils.bubbleSort(numbers);

        ArrayUtils.printArrayInt(numbers);

    }
}
