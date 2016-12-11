package utils;

/**
 *@author Yevhen Vorobiei
 * @since ACB21
 */
public class ArrayUtils {

    public static void printArray(int[] arr){

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void printArray(double[] arr){

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void printArray(char[] arr){

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void printArray(String[] arr){

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }


    public static int[] createAndFillArray(int size){
//        create array
        int[] array = new int[size];
//        fill array
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
//        return array
        return array;
    }

    public static double[] createAndFillFloatingArray(int size){
//        create array
        double[] array = new double[size];
//        fill array
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
//        return array
        return array;
    }

    public static int[] createAndFillRandomArray(int size){
//        create array
        int[] array = new int[size];
//        fill array
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random() * 100);
        }
//        return array
        return array;
    }
    public static int[] createAndFillRandomArrayInRange(int size, int min, int max){
//        create array
        int[] array = new int[size];
//        fill array
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(min + Math.random() * (max - min));
        }
//        return array
        return array;
    }


    public static double findAverage(int[] array) {

        int sum = 0;
        double amount = array.length;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum * 1.0 / amount;
    }

    private static int findMin(int[] array) {

        if(array == null || array.length == 0) {
            return -1;
        }
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if(array[i] < min){
                min = array[i];
            }
        }
        return min;
    }

    private static int findMax(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if(array[i] > max){
                max = array[i];
            }
        }
        return max;
    }

    public static void printMinMax(int[] array) {
        if(array == null || array.length == 0) {
            System.err.println("Array is null or length == 0");
            return;
        }
        int max = findMax(array);
        int min = findMin(array);
        System.out.println("min - " + min + " max - " + max);

    }

    public static void swapMinMax(int[] array) {
        if(array == null || array.length == 0) {
            System.err.println("Array is null or length == 0");
            return;
        }
        int minIdx = findMinIndex(array);
        int maxIdx = findMaxIndex(array);
        swap(array, maxIdx, minIdx);
    }

    private static void swap(int[] array, int maxIdx, int minIdx) {
        int temp = array[maxIdx];
        array[maxIdx] = array[minIdx];
        array[minIdx] = temp;
    }

    private static int findMaxIndex(int[] array) {
        int maxIdx = 0;
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if(array[i] > max){
                max = array[i];
                maxIdx = i;
            }
        }
        return maxIdx;
    }

    private static int findMinIndex(int[] array) {
        int minIdx = 0;
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if(array[i] < min){
                min = array[i];
                minIdx = i;
            }
        }
        return minIdx;
    }

    /**
    * Copy data from array 1 to array2
    *
    * @param array1 source
    * @param array2 destination
     *
    * */
    public static void copyArray(int[] array1, int[] array2) {
        if(array1 == null || array2 == null || array1.length != array2.length){
            System.err.println("Wrong data");
            return;
        }

        for (int i = 0; i < array1.length; i++) {
            array2[i] = array1[i];
        }
    }

    public static void bubbleSort(int[] array){


        for (int j = 0; j < array.length; j++) {
            for (int i = 0; i < array.length - 1; i++) {
                if(array[i] > array[i + 1]){
                    int tmp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = tmp;
                }
            }
        }

    }

}
