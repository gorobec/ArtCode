package week3.day1;

import utils.ArrayUtils;

/**
 * @author Yevhen Vorobiei
 * @since JDK 1.8
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] array = ArrayUtils.generateArray(10, 0, 100);
        ArrayUtils.printArray(array);
        ArrayUtils.bubbleSort(array);
        ArrayUtils.printArray(array);
    }
}
