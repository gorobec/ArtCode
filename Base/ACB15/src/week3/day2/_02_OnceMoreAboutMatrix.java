package week3.day2;

import utils.MatrixUtils;

/**
 * Created by gorobec on 23.04.16.
 */
public class _02_OnceMoreAboutMatrix {
    public static void main(String[] args) {
//        1
        int[][] matrix = new int[5][5];
//        2
        int[][] matrix2 = {{1, 2, 3}, {4, 5}, {6, 7, 8}};
//        3
        int[][] matrix3 = new int[3][];
        matrix3[0] = new int[3];
        matrix3[1] = new int[2];
        matrix3[2] = new int[3];


        MatrixUtils.printMatrix(matrix3);

    }
}
