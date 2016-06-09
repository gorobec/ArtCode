package week2.day2;

import utils.ArrayUtils;

/**
 * Created by gorobec on 24.01.16.
 */
public class TestIntegerCopy {
    public static void main(String[] args) {
        int[] numbers1 = ArrayUtils.createRandomArray(10, 5, 15);
        int[] numbers2 = new int[15];
        ArrayUtils.showArray(numbers1);
        ArrayUtils.copyArray(numbers2, numbers1);
        ArrayUtils.showArray(numbers2);
    }
}
