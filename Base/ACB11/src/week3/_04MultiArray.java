package week3;




import utils.MultiArrayUtils;

import java.util.Arrays;

public class _04MultiArray {
    public static void main(String[] args) {
        int[] arr = new int[10];

        int[][] matrix = MultiArrayUtils.createMatrix(4,4);
        String matrixString = MultiArrayUtils.showMatrix(matrix);
        System.out.println(matrixString);

        int[][] matrix2 = {{1,2,3},{4,5},{7,8,9}};

        int[][] matrix3 = new int[5][];

        matrix3[0] = new int[7];
        matrix3[1] = new int[4];
        matrix3[2] = new int[3];
        matrix3[3] = new int[2];
        matrix3[4] = new int[1];
                                    // i = i +1;
       /* for (int i = 0; i < arr.length; i++) {
//            read i > i == 0 > i = i +1; > arr[0] = i;
            arr[i] = ++i;
            
//            read i > i == 0 >  > arr[0] = i; i = i + 1;
            
            arr[i] = i++;
            
        }*/


    }


}
