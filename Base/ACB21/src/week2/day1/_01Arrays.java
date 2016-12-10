package week2.day1;


import utils.ArrayUtils;

/**
 * Created by gorobec on 10.12.16.
 */
public class _01Arrays {
    public static void main(String[] args) {

        int[] array = ArrayUtils.createAndFillRandomArrayInRange(100, 25, 75);
        ArrayUtils.printArray(array);

        double[] floatingArray = ArrayUtils.createAndFillFloatingArray(25);
        ArrayUtils.printArray(floatingArray);
    }
}
