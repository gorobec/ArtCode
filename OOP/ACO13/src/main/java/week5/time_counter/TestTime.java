package week5.time_counter;

import utils.ArrayUtils;

import java.util.Arrays;

/**
 * Created by gorobec on 25.06.16.
 */
public class TestTime {
    public static void main(String[] args) {
        TimeCounter bubbleTime = new TimeCounter();
        int[] array = ArrayUtils.createArray(100000);
        Arrays.copyOf(array, array.length);

        long bubbleSort = bubbleTime.count(new Action() {
            @Override
            public void run() {
                ArrayUtils.bubleSort(Arrays.copyOf(array, array.length));
            }
        });

        System.out.println("BubleSort - " + bubbleSort);

    TimeCounter selectTime = new TimeCounter();

        long selectSort = selectTime.count(new Action() {
            @Override
            public void run() {
                ArrayUtils.selectSort(Arrays.copyOf(array, array.length));
            }
        });

        System.out.println("Select sort - " + selectSort);
    }
}
