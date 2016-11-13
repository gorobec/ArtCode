package utils;

/**
 * Created by gorobec on 12.11.16.
 */
public class ArrayUtils {
    public static int[] createRandomArray(int size, int min, int max){
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = generateNumber(min, max);
        }
        return array;
    }

    private static int generateNumber(int min, int max) {
        return (int)(min + Math.random() * (max - min));
    }
}
