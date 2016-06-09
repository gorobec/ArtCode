package utils;

/**
 * Created by gorobec on 23.04.16.
 */
public class MatrixUtils {

    public static int[][] createAndFill(int rows, int columns){
        int[][] matrix = new int[rows][columns];
        int count = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = count++;
            }
        }
        return matrix;
    }
    public static void printMatrix(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("%-2d ", matrix[i][j]);
            }
            System.out.println();
        }
    }
}
