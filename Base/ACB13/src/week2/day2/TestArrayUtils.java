package week2.day2;

import utils.ArrayUtils;

/**
 * Created by gorobec on 24.01.16.
 */
public class TestArrayUtils {
    public static void main(String[] args) {
        int[] randomArray = ArrayUtils.createRandomArray(15, 10, 20);
        ArrayUtils.showArray(randomArray);
    }
}
