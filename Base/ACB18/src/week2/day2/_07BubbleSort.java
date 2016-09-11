package week2.day2;

/**
 * Created by gorobec on 11.09.16.
 */
public class _07BubbleSort {
    public static void main(String[] args) {
        int[] array = {5, 3, 8, 6, 2};
        // {3, 5, 6, 2, 8};

        for(int j = 0; j < array.length; j++) {
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int tmp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = tmp;

                }
            }
        }
    }
}
