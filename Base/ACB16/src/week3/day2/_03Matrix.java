package week3.day2;

import utils.ArrayUtils;
import utils.MultiArrayUtils;

/**
 * Created by gorobec on 05.06.16.
 */
public class _03Matrix {
    public static void main(String[] args) {
        int[] array = ArrayUtils.createAndFillArray(5);
        int[] array2 = ArrayUtils.createAndFillArray(3);
        int[] array3 = ArrayUtils.createAndFillArray(6);

        int[][] multiArray = new int[5][3];

        int[][] multi = {{1, 2},{3, 4, 5},{6}};

        int[][] multiArray2 = new int[5][];

        multiArray2[0] = array;
        multiArray2[1] = array2;
        multiArray2[2] = array2;
        multiArray2[3] = array3;
        multiArray2[4] = array2;


        MultiArrayUtils.printMatrix(multiArray2);

        System.out.println("-------");

        MultiArrayUtils.printMatrix(multi);

        System.out.println("-----------");

        MultiArrayUtils.printMatrix(multiArray);
    }
}
