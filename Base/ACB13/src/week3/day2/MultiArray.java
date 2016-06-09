package week3.day2;

/**
 * Created by gorobec on 31.01.16.
 */
public class MultiArray {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};
        String[] words = {"aaa", "sss", "ddd"};

//        creation <type>[][] <name> = new <type>[<rows size>][<columns size>];
        int[][] matrix1 = new int[3][3];

//        creation <type>[][] <name> = {{value, value},{value, value},{value, value}}
        int[][] matrix2 = {{0, 1, 2},{3, 5},{6, 7, 8}};


//
        int[][] matrix3 = new int[3][];
        matrix3[0] = new int[2];
        matrix3[1] = new int[5];
        matrix3[2] = new int[0];



    }
}
