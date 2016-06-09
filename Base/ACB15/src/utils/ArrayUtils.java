package utils;

/**
 * Created by gorobec on 16.04.16.
 */
public class ArrayUtils {

//              return type
    public static void printArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void printArray(String[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static void printArray(char[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static int[] createAndFillArray(int size){
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = i;
        }
        return array;
    }

//    int random = (int) (min + Math.random() * (max - min));

    public static int[] createAndFillRandomArray(int size, int min, int max){
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(min + Math.random() * (max - min));
        }
        return array;
    }

    public static void bubbleSort(int[] array){
        for (int j = array.length; j > 0; j--) {
            for (int i = 0; i < j - 1; i++) {
                if(array[i] > array[i + 1]){
//                swap
                    int tmp = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = tmp;
                }
            }
        }
    }
    public static void bubbleSort(String[] array){
        for (int j = array.length; j > 0; j--) {
            for (int i = 0; i < j - 1; i++) {
//                if(array[i] > array[i + 1]){
                  if(array[i].compareTo(array[i + 1]) > 0){
//                swap
                    String tmp = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = tmp;
                }
            }
        }
    }
    public static int findAverage(int[] array){
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            result += array[i];
        }
        return result / array.length;
    }

    public static void findMinMax(int[] array){
        int min = array[0];
        int max = array[0];

        for (int i = 0; i < array.length; i++) {
            if(array[i] > max){
                max = array[i];
            } else if(array[i] < min){
                min = array[i];
            }
        }
        System.out.printf("Min - %d\nMax - %d\n", min, max);
    }

    public static int[] createOddEvenArray(int size, int min, int max){
        int[] array = new int[size];

        for (int i = 0; i < array.length; i++) {
            int random = (int)(min + Math.random() * (max - min));
            if(i % 2 == 0){
//                even number
                array[i] = random % 2 == 0 ? random : ++random;
                /*if(random % 2 == 0)
                    array[i] = random;
                else
                    array[i] = ++random;*/

            } else {
//                odd number
                array[i] = random % 2 == 0 ? ++random : random;
                /*if(random % 2 == 0)
                    array[i] = ++random;
                else
                    array[i] = random;*/
            }
        }
        return array;
    }
}
