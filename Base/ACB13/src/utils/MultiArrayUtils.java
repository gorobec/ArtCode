package utils;

/**
 * Created by gorobec on 31.01.16.
 */
public class MultiArrayUtils {

    public static int[][] createAndFillMatrix(int rows, int columns){
        int[][] matrix = new int[rows][columns];
        int counter = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <columns; j++) {
                matrix[i][j] = counter++;
            }
        }
        return matrix;
    }
    public static int[][] fillMatrix(int[][] matrix){
        int counter = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j <matrix[i].length; j++) {
                matrix[i][j] = counter++;
            }
        }
        return matrix;
    }

    public static void showMatrix(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j <matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
