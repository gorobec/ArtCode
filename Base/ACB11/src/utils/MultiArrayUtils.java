package utils;


public class MultiArrayUtils {

    public static int[][] createMatrix(int rows, int columns) {
        int[][] matrix = new int[rows][columns];

        int count = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = count++;
            }

        }
        return matrix;
    }

    public static String showMatrix(int[][] matrix){
        String s = "";
        for (int i = 0; i < matrix.length ; i++) {
            for (int j = 0; j <matrix[i].length ; j++) {
               s += matrix[i][j] + " ";
            }
            s += "\n";

        }
        return s;
    }
}
