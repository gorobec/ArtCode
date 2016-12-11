package home_work.week2;

import utils.ArrayUtils;

/**
 * Заданы два массива одинаковой длинны с любыми значениями скопировать данные из первого массива во второй
 */
public class Task4 {
    public static void main(String[] args) {
        int[] array1 = ArrayUtils.createAndFillRandomArray(20);
        int[] array2 = new int[10];
        ArrayUtils.printArray(array1);
        ArrayUtils.printArray(array2);
        ArrayUtils.copyArray(array1, array2);
        ArrayUtils.printArray(array2);
    }
}
