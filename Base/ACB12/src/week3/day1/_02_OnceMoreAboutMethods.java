package week3.day1;


public class _02_OnceMoreAboutMethods {
    public static void main(String[] args) {
        int[] array = createAndFillArray(10);

        int[] array2 = createAndFillArray(10);

        int[] array3 = createAndFillArray(20);


        String arr1 = showArray(array);
        String arr2 = showArray(array2);

        System.out.println(arr1);
        System.out.println(arr2);
        System.out.println(arr1.equals(arr2));

       /* showArray(array);
        showArray(array2);
        showArray(array3);*/

    }

    public static int[] createAndFillArray(int length) {
        int[] array = new int[length];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        return array;
    }

    /*public static void showArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }*/

    public static String showArray(int[] array){
        String s = "";
//        String s = new String();
        for (int i = 0; i < array.length; i++) {
           s += array[i] + " ";
        }
        return s;
    }
}
