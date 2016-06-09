package week2.day2;

import utils.ArrayUtils;


public class _03SimpleSort {
    public static void main(String[] args) {
        int[]numbers = ArrayUtils.createRandomArray(10, 10);
        ArrayUtils.showArray(numbers);
        numbers = ArrayUtils.sortArray(numbers);
        ArrayUtils.showArray(numbers);

    }
}
