package week3.day2;

import java.util.Arrays;

/**
 * @author Yevhen Vorobiei
 * @since JDK 1.8
 */
public class Sorting {
    public static void main(String[] args) {
        int[] array = {9, -1, 2, 0, 18, 7, 3, 12};


        for (int j = 0; j < array.length; j++) {
            boolean wasSwap = false;
            for (int i = 0; i < array.length -1 - j; i++) {
                if(array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    wasSwap = true;
                }
            }
            if(!wasSwap) break;
        }


        System.out.println(Arrays.toString(array));
    }
}
