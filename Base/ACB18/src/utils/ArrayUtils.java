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

    public static int[] createArray(int size){
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = i;
        }
        return array;
    }

    public static int[] createRandomArray(int size, int min, int max){
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = (int)(min + Math.random() * (max - min));
        }

        return array;
    }

}
