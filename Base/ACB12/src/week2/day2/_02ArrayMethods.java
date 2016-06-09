package week2.day2;

import utils.ArrayUtils;

public class _02ArrayMethods {
//    create and fill array
//    print array

    public static void main(String[] args) {
        int[] numbers = ArrayUtils.createAndFillArray(100);
        ArrayUtils.showArray(numbers);
        int[] newNumbers = ArrayUtils.createRandomArray(10, 20);
        ArrayUtils.showArray(newNumbers);
    }

}
