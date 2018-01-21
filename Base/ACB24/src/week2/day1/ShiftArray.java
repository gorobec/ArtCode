package week2.day1;

/**
 * @author Yevhen Vorobiei
 * @since JDK 1.8
 */
public class ShiftArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        printArray(array);
        shiftArray(array, 5);
        printArray(array);


    }

    private static void shiftArray(int[] array, int shift) {
        if(shift % array.length == 0) return;
        for (int j = 0; j < shift; j++) {
            int temp = array[array.length - 1];
            for (int i = array.length - 1; i > 0; i--) {
                array[i] = array[i - 1];
            }
            array[0] = temp;
        }
    }

    public static void printArray(int[] arr) {
        if (arr == null) {
            System.out.println(arr);
            return;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }
}
