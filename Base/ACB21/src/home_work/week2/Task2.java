package home_work.week2;

import utils.ArrayUtils;

/**
 * 2) Найти среднее арифметическое массива
 */
public class Task2 {
    public static void main(String[] args) {
        int[] array = ArrayUtils.createAndFillRandomArray(25);
        ArrayUtils.printArray(array);
        double average = ArrayUtils.findAverage(array);
        System.out.println(average);
    }
}
