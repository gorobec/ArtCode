package week2.day2;

import utils.ArrayUtils;

import java.util.Scanner;

/**
 * Created by gorobec on 24.01.16.
 */
public class MethodIntroduce {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        sc.nextInt();


        int[] numbers = ArrayUtils.createAndFillArray(10);
        int[] numbers2 = ArrayUtils.createAndFillArray(20);
        int[] numbers3 = ArrayUtils.createAndFillArray(30);
        int[] numbers4 = ArrayUtils.createAndFillArray(40);

        ArrayUtils.showArray(numbers);
        ArrayUtils.showArray(numbers2);
        ArrayUtils.showArray(numbers3);
        ArrayUtils.showArray(numbers4);

        char[] letters = {'a', 'b', 'c'};
        ArrayUtils.showArray(letters);

        int[] numbersWithRange = ArrayUtils.createAndFillArrayInRange(10, 13);
        ArrayUtils.showArray(numbersWithRange);

//        if nothing return - return type - void
//        public static <return_type> <name_of method>(){
//          logic

//            return <name_of_variable>;
//        }
//
//
//      if nothing return - return type - void
//        public static <return_type> <name_of method>(<args type><args name>){
//          logic

//            return <name_of_variable>;
//        }

    }
}
