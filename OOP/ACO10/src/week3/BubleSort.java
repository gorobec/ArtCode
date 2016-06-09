package week3;


import java.util.Arrays;

public class BubleSort {
    public static void main(String[] args) {
        int[] array = {5, 9, 8, 45, 0, 18, 14};
        System.out.println(Arrays.toString(array));
        int[] sortArray = bubbleSort(array);
        System.out.println(Arrays.toString(sortArray));

    }

    public static int[] bubbleSort(int[] array) {
        for (int i = array.length; i >= 0; i--) {
            for (int j = 0; j < i - 1; j++) {
                if(array[j] > array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
        return array;
    }
}
