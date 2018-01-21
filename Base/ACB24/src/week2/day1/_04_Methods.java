package week2.day1;

/**
 * @author Yevhen Vorobiei
 * @since JDK 1.8
 */
public class _04_Methods {
    public static void main(String[] args) {

//        public static <return type (void)> <name> (<args...(0 -> ...)>) {
//              <logic>
//        }


        int[] array = null;
        int[] array2 = array;

//        array2[0] = 16;


        printArray(array);
//        printArray(array2);

//        System.out.println(findMin(array));


    }

    public static void printArray(int[] arr) {
        if (arr == null) {
            System.out.println(arr);
            return;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 4) {
                return;
            }
            System.out.println(arr[i]);
        }

    }

    public static int findMin(int[] arr) {

        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}
