package utils;

/**
 * @author Yevhen Vorobiei
 * @since JDK 1.8
 */
public class ArrayUtils {

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void printArray(char[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    public static void printArray(double[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static int[] generateArray (int size, int min, int max){
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = (int) (min + Math.random() * (max - min));
        }

        return array;
    }
    public static int[] generateArray (int size){
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = i;
        }

        return array;
    }

    public static void bubbleSort(int[] array) {


        for (int j = 0; j < array.length; j++) {
            boolean wasSwap = false;

            for (int i = 0; i < array.length - 1 - j; i++) {
                if(array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    wasSwap = true;
                }
            }
            if(!wasSwap) return;
        }
    }
}
