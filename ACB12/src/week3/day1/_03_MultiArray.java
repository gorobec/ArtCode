package week3.day1;


import utils.MatrixUtils;

public class _03_MultiArray {
    public static void main(String[] args) {
//        <type>[][] <name> = new <type>[rowsSize][columnsSize];
//        <type>[][] <name> = {{args..},{args..},{args..}};

//        int[][] matrix = new int[3][4];

        /*matrix[0][0] = 1;
        matrix[0][1] = 1;
        matrix[0][2] = 1;
        matrix[0][3] = 1;
        matrix[1][0] = 1;
        matrix[1][1] = 1;
        matrix[1][2] = 1;
        matrix[1][3] = 1;
        matrix[2][0] = 1;
        matrix[2][1] = 1;
        matrix[2][2] = 1;
        matrix[2][3] = 1;
*/
//        System.out.println(matrix[2].length);

        int[][] matrix  = MatrixUtils.createAndFillMatrix(3, 4, 25, 100);

         MatrixUtils.showMatrix(matrix);
    }
}
