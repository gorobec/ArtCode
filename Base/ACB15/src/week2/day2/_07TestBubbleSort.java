package week2.day2;

import utils.ArrayUtils;

/**
 * Created by gorobec on 17.04.16.
 */
public class _07TestBubbleSort {
    public static void main(String[] args) {
        int[] numbers = ArrayUtils.createAndFillRandomArray(10, 1, 101);
        ArrayUtils.printArray(numbers);
        ArrayUtils.bubbleSort(numbers);
        ArrayUtils.printArray(numbers);
    }
}
