package utils;


public class MatrixUtils {
    public static int[][] createAndFillMatrix(int rowsSize, int columnsSize, int min, int max){
        int[][]matrix = new int[rowsSize][columnsSize];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = MathUtils.generateRandomDigits(min,max);
            }
        }
        return matrix;
    }
public static void showMatrix(int[][] matrix){

    for (int i = 0; i < matrix.length; i++) {
        for (int j = 0; j < matrix[i].length; j++) {
            System.out.print(matrix[i][j] + " ");
        }
        System.out.println();
    }
    System.out.println();

}

}
