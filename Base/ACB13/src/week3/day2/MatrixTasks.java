package week3.day2;

import utils.MultiArrayUtils;

/**
 * Created by gorobec on 31.01.16.
 */
public class MatrixTasks {
    public static void main(String[] args) {
        int[][] matrix = new int[5][];
        matrix[0] = new int[2];
        matrix[1] = new int[5];
        matrix[2] = new int[4];
        matrix[3] = new int[6];
        matrix[4] = new int[3];

        matrix = MultiArrayUtils.fillMatrix(matrix);
        MultiArrayUtils.showMatrix(matrix);



    }
}
