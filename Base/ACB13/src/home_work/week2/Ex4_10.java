package home_work.week2;

import utils.ArrayUtils;

/**
 * Created by gorobec on 28.01.16.
 */
public class Ex4_10 {
    public static void main(String[] args) {
        int[] array = ArrayUtils.createAndFillArray(15);
        ArrayUtils.showArray(array);
        int[] splitArray = splitArray(array, 3, 9);
        ArrayUtils.showArray(splitArray);
    }
    public static int [] splitArray(int[] array, int start, int end){
        int[] arraySplit = new int[end - start];
        for (int i = 0; i < arraySplit.length; i++, start++) {
            arraySplit[i] = array[start];
        }
        return arraySplit;
    }
}
