package utils;

/*
*
* @author
* @since
*
* */
public class ArrayUtils {
    //    signature
    public static int[] createAndFillArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = i;
            /*if( i == 5)
                return array;*/
        }
        return array;
    }

    /*
    * Take integer array and show it on console
    *
    * */
    public static void showArray(int[] array) {
//        logic
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void showArray(char[] array) {
//        logic
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static int[] createAndFillArrayInRange(int size, int from) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = from++;
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

    public static void copyArray(char[] destination, char[] source) {
        for (int i = 0; i < source.length; i++) {
            if (i >= destination.length) {
                break;
            }
            destination[i] = source[i];
        }
    }

    public static void copyArray(int[] destination, int[] source) {
        for (int i = 0; i < source.length; i++) {
            if (i >= destination.length) {
                break;
            }
            destination[i] = source[i];
        }
    }

    public static void copyArray(long[] destination, long[] source) {
        for (int i = 0; i < source.length; i++) {
            if (i >= destination.length) {
                break;
            }
            destination[i] = source[i];
        }
    }

    public static int[] fillArrayPairedUnpairedNumbers(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0)
                array[i] = getRandomEven();
            else
                array[i] = getRandomOdd();
        }
        return array;
    }

    private static int getRandomEven() {
        int random = (int) (1 + Math.random() * 100 - 1);
        /*if (random % 2 == 0)
            return random;
        else
            return random + 1;*/

        return random % 2 == 0 ? random : ++random;
    }

    private static int getRandomOdd() {
        int random = (int) (1 + Math.random() * 100 - 1);
        return random % 2 != 0 ? random : ++random;
    }

}
