package week2;

import java.util.Arrays;

/**
 * @author Yevhen Vorobiei
 * @since JDK 1.8
 */
public class ArrayCreationAndFill {
    public static void main(String[] args) {

        int[] array2 = new int[1000];

        array2[0] = 0;
        array2[1] = 1;

        for (int i = 0; i < array2.length; i++) {
            array2[i] = i + 1;

        }


        System.out.print("[");

        for (int i = 0; i < array2.length - 1; i++) {
            System.out.print(array2[i] + ", ");
        }

        System.out.print(array2[array2.length - 1] + "]");


        int[] array = new int[10];

        for (int i = array.length - 1; i >= 0 ; i--) {
            array[i] = (int) (Math.random() * 100);
        }

        System.out.println();
        System.out.print("[");

        for (int i = 0; i < array.length - 1; i++) {
            System.out.print(array[i] + ", ");
        }

        System.out.print(array[array.length - 1] + "]");


    }
}
