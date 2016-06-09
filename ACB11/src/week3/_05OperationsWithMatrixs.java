package week3;


import utils.MultiArrayUtils;

public class _05OperationsWithMatrixs {
    public static void main(String[] args) {
        int[][]matrix1 = MultiArrayUtils.createMatrix(5,5);
        int[][]matrix2 = MultiArrayUtils.createMatrix(5,5);
        String s1 = MultiArrayUtils.showMatrix(matrix1);
        String s2 = MultiArrayUtils.showMatrix(matrix2);
        System.out.println(s1 + "\n\n");
        System.out.println(s2 + "\n\n");
        int[][]sumOfMatrixs = new int[5][5];

        for (int i = 0; i < sumOfMatrixs.length; i++) {
            for (int j = 0; j < sumOfMatrixs[i].length; j++) {
                sumOfMatrixs[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        String s = MultiArrayUtils.showMatrix(sumOfMatrixs);
        System.out.println(s);
    }
}
