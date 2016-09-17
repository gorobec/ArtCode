package week3.day1;

import utils.MultiArrayUtils;

/**
 * Created by gorobec on 17.09.16.
 */
public class _05MultiArrayFilling {
    public static void main(String[] args) {
        int[][] matrix = MultiArrayUtils.createAndFillMatrix(7, 9);
        MultiArrayUtils.printMatrix(matrix);

    }
}
