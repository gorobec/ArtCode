package utils;

/**
 * Created by gorobec on 10.09.16.
 */
public class ArrayUtils {
//    public static <return_type> <name(verb)>(<input_type> <arg_name>...){
//
//              logic
//          if return_type != void
//                return some value(value type == <return_type>)
//          else
//                return doesn't need
//    }

    /**
     * Print array of Integers
     * */
    public static void printArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void printArray(char[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void printArray(double[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void printArray(String[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static int[] createArray(int size){
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = i;
        }
        return array;
    }

    public static int[] createRandomArray(int size, int min, int max) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = (int) (min + Math.random() * (max - min));
        }

        return array;
    }

    public static int[] bubbleSort(int[] array) {

        for (int j = array.length - 1; j >= 0; j--) {
            for (int i = 0; i < j; i++) {
                if(array[i] > array[i + 1]){
                    swap(array, i, i + 1);
                }
            }
        }
        return array;
    }

    public static String[] bubbleSort(String[] array) {

        for (int j = array.length - 1; j >= 0; j--) {
            for (int i = 0; i < j; i++) {
//                if(array[i] > array[i + 1]){
                if(array[i].compareTo(array[i + 1]) > 0){
                    swap(array, i, i + 1);
                }
            }
        }
        return array;
    }

    public static String arrayToString(int[] array){

        if(array == null) return null;

        String arrayAsString = "[";

        for (int i = 0; i < array.length - 1; i++) {
            arrayAsString += array[i] + ", ";
        }
        if(array.length > 0)
            arrayAsString += array[array.length - 1];

        return arrayAsString + "]";
    }


    public static String arrayToString(String[] array){

        if(array == null) return null;

        String arrayAsString = "[";

        for (int i = 0; i < array.length - 1; i++) {
            arrayAsString += array[i] + ", ";
        }
        if(array.length > 0)
            arrayAsString += array[array.length - 1];

        return arrayAsString + "]";
    }

    private static void swap(Object[] array, int i, int j){
        Object tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }
    private static void swap(int[] array, int i, int j){
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }


}
