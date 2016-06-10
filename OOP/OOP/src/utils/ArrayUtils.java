package utils;


public class ArrayUtils {
    public static void showArray(char[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void showArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    public static void showArray(String[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static int[] createAndFillArray(int size){
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            numbers[i] = i;
        }
        return numbers;
    }

    public static int[] createRandomArray(int size, int range){
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            numbers[i] = getGenerateRandomDigit(range);
        }
        return numbers;
    }

    private static int getGenerateRandomDigit(int range) {
        return (int)(Math.random() * range);
    }

    public static int[] sortArray(int[] array){
        for (int j = array.length; j >=0; j--) {
            for (int i = 0; i < j - 1; i++) {
                if (array[i] > array[i + 1]){
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
        }

        return array;
    }
}
