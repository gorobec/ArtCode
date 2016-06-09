package week2.day1;

/**
 * Created by gorobec on 16.04.16.
 */
public class _03ForLoop {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7};

        /*System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
        System.out.println(numbers[3]);
        System.out.println(numbers[4]);
        System.out.println(numbers[5]);
        System.out.println(numbers[6]);*/
//      for(<start>; <condition>; <way>)

        for (int i = 0; i < numbers.length; i++) {
//            logic
            System.out.println(numbers[i]);

        }

        int[] numbers2 = new int[15];
        for (int i = 0; i < numbers2.length; i++) {
            numbers2[i] = i;
        }

        for (int i = 0; i < numbers2.length; i++) {

            System.out.println(numbers2[i]);
        }

    }
}
