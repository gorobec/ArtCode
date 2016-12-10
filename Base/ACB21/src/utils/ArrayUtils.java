package utils;

/**
 * Created by gorobec on 10.12.16.
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
}
