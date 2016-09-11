package week2.day2;

import utils.ArrayUtils;

/**
 * Created by gorobec on 11.09.16.
 */
public class _04SystemTime {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        int[] array = ArrayUtils.createArray(1000_000_000);
        long finish = System.currentTimeMillis();

        System.out.println("Process of creation array take - " + (finish - start) + " milliseconds");
    }
}
