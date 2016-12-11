package home_work.week2;

import utils.ArrayUtils;

/**
 * Найти минимальное и максимальное значения в массиве и вывести их на консоль
 */
public class Task1 {
    public static void main(String[] args) {
        int[] array = ArrayUtils.createAndFillRandomArray(10);
        ArrayUtils.printArray(array);
        ArrayUtils.printMinMax(array);

    }
}
