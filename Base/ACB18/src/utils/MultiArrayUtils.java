package utils;

/**
 * Created by gorobec on 17.09.16.
 */
public class MultiArrayUtils {
    public static int[][] createAndFillMatrix(int row, int column){

        int[][] matrix = new int[row][column];

        int num = 0;

        for (int i = 0; i < row; i++){
            for (int j = 0; j < column; j++){
                matrix[i][j] = num++;
            }
        }
        return matrix;
    }


    public static void printMatrix(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j <matrix[i].length; j++) {
                System.out.printf("%-3d", matrix[i][j]);
            }
            System.out.println();
        }
    }
}
