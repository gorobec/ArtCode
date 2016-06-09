package utils;


public class ArrayUtils {
//                      void
    // public static <return type> <name, verb> (<data type><data name>){
    //
    //          logic
//            return <value>
    // }

    // public static <return type> <name, verb> (){
    //
    //          logic
    //            return <value>
    // }

    public static void printArrayInt(int[] array) {
        System.out.print("[ ");
        for (int i : array) {
            System.out.print(i + ", ");
        }
        System.out.println("]");
    }

    public static void printArrayString(String[] array) {
        System.out.print("[ ");
        for (String i : array) {
            System.out.print(i + ", ");
        }
        System.out.println("]");
    }
    public static String showContent (int[] array){
        String content = "";
        for (int i : array) {
            content += i + " ";
        }
        return content;
    }


    public static int findMin(int[] array) {
        if (array.length == 0) {
            System.out.print("_03Array is empty!");
            System.exit(1);
        } else {
            int min = array[0];
            for (int i = 1; i < array.length; i++) {
                if (min > array[i]) {
                    min = array[i];
                }
            }
            return min;
        }
        return 0;
    }

    public static int[] bubbleSort(int[] array) {
        for (int j = array.length - 1; j >= 0; j--) {
            for (int i = 0; i < j; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = temp;
                }
            }
        }
        return array;
    }


    public static int[] selectSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; ++i) {
            for (int j = i + 1; j < arr.length; ++j) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            printArrayInt(arr);

        }
        return arr;
    }

    public static int[] createAndRandomFillArray(int arrayLength,int minNumber, int maxNumber) {
        int[] array = new int[arrayLength];
        for (int i = 0; i < array.length; i++) {
            array[i] =(int) (minNumber + Math.random() * (maxNumber - minNumber));
        }
        return array;

    }

    public static int[] genRandomArray(int size){
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        return array;
    }
}
