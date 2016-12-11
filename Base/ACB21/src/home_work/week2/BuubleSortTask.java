package home_work.week2;

import utils.ArrayUtils;

/**
 * Created by gorobec on 11.12.16.
 */
public class BuubleSortTask {
    public static void main(String[] args) {
        int[] array = ArrayUtils.createAndFillRandomArray(10);
        ArrayUtils.printArray(array);
        ArrayUtils.bubbleSort(array);
        ArrayUtils.printArray(array);
    }
}
