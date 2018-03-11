package week3.day1;

import week2.Array;

/**
 * @author Yevhen Vorobiei
 * @since JDK 1.8
 */
public class Methods {
    public static void main(String[] args) {
        int[] arr = null;

        double[] arr2 = {3, 5, 7, 9, 10, 13};

        Array.printArray(arr);

        Array.printArray(arr2);

        String s = Array.arrayToString(arr);
        System.out.println(s);
    }
}
