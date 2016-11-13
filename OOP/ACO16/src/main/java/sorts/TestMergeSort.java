package sorts;

import utils.Action;
import utils.ArrayUtils;
import utils.TimeChecker;

import java.util.Arrays;

/**
 * Created by gorobec on 12.11.16.
 */
public class TestMergeSort {
    public static void main(String[] args) {

        int size = 50_000_000;

        int[] array = ArrayUtils.createRandomArray(size, 0, 1_000);
        int[] copy = Arrays.copyOf(array, size);
        int[] copy2 = Arrays.copyOf(array, size);
        System.out.println("Start sorting");

        long mergeTime = TimeChecker.checkTime(new Action() {
            @Override
            public void run() {
                MergeSort.sort(array);
            }
        });

        long yuraTime = TimeChecker.checkTime(new Action() {
            @Override
            public void run() {
                Yura.sort(copy);
            }
        });

        long dimaTime = TimeChecker.checkTime(new Action() {
            @Override
            public void run() {
                Dima.mergeSort(copy2);
            }
        });

        System.out.printf("Merge time - %d ms%n", mergeTime);
        System.out.printf("Yura time - %d ms%n", yuraTime);
        System.out.printf("Dima time - %d ms%n", dimaTime);
    }
}
