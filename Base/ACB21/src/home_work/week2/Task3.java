package home_work.week2;

import utils.ArrayUtils;

/**
 * Поменять местами наибольший
 и наименьший элементы в массиве
 */
public class Task3 {
    public static void main(String[] args) {
        int[] array = ArrayUtils.createAndFillRandomArray(15);
        ArrayUtils.printArray(array);
        ArrayUtils.swapMinMax(array);
        ArrayUtils.printArray(array);
    }
}
