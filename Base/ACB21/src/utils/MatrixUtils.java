package utils;

/**
 * Created by gorobec on 24.12.16.
 */
public class MatrixUtils {
    public static int[][] createAndFillMatrix(int rows, int columns) {
        int[][] matrix = new int[rows][columns];

        int counter = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = counter++;
            }
        }

        return matrix;
    }


    public static void fillMatrix(int[][] matrix) {

        int counter = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = counter++;
            }
        }
    }

    public static void printMatrix(int[][] matrix) {


        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("%-3d ",matrix[i][j]);
            }
            System.out.println();
        }
    }
}
