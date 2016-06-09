package utils;

/**
 * Created by gorobec on 05.06.16.
 */
public class MultiArrayUtils {
    public static void printMatrix(int[][] matrix){
        for (int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                System.out.printf("%3d ", matrix[i][j]);
            }
            System.out.println();
        }
    }

    public static int[][] createMatrix(int rows, int columns){

        int[][] matrix = new int[rows][columns];

        for (int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                matrix[i][j] = (int)(Math.random() * 100);
            }
        }
        return matrix;
    }
}
