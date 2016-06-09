package week2.home;

import utils.ArrayUtils;

/**
 * Найти среднее арифметическое массива
 */
public class Task2 {
    public static void main(String[] args) {
        int[] numbers = ArrayUtils.createAndFillArray(101);
        ArrayUtils.printArray(numbers);


        int average = ArrayUtils.average(numbers);
        System.out.println("Average of array - " + average);
    }
}
