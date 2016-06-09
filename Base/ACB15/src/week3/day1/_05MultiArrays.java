package week3.day1;

import utils.ArrayUtils;
import utils.MatrixUtils;

/**
 * Created by gorobec on 23.04.16.
 */
public class _05MultiArrays {
    public static void main(String[] args) {
        int[] nums = ArrayUtils.createAndFillRandomArray(15, 0, 25);
        int[] nums2 = ArrayUtils.createAndFillRandomArray(15, 0, 25);

        int[][] matrix = {{0, 1, 2}, {3, 4}, {5, 6, 7}};

        int[][] matrix2 = new int[3][4];


        int[][]matrix3 = MatrixUtils.createAndFill(3, 4);
        MatrixUtils.printMatrix(matrix3);
    }
}
