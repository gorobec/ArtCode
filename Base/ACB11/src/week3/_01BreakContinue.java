package week3;


import java.util.Arrays;

public class _01BreakContinue {

    public static void main(String[] args) {
        int[]arr = new int[100];

        for (int i = 0; i < arr.length; i++) {
            if (i == 13) {
                break;
            }
            else {
                arr[i] = i;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
