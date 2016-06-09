package week2;


import utils.ArrayUtils;

import java.util.Arrays;

public class _03Array {
    public static void main(String[] args) {
        String name1 = "Kate";
        String name2 = "Sasha";
        String name3 = "Vlad";
        String name4 = "Kostja";
        String name5 = "Serhij";

        String[] names = {"Kate", "Sasha", "Vlad", "Kostja", "Serhii"};

//        <type> [] <name>  = new <type>[<size>];
//        <type> [] <name>  = {<value>, <value> ....};

        int [] numbers = new int[10];
//        <array name> [<number of cell>] = <value>;
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        numbers[3] = 4;
        numbers[4] = 5;
        numbers[5] = 6;
        numbers[6] = 7;
        numbers[7] = 8;
        numbers[8] = 9;
        numbers[9] = 10;

        System.out.println(Arrays.toString(numbers));

        /*for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.println(numbers[i]);
        }

//           for each
        for (int i : numbers) {
//            logic
            System.out.println(i);
        }*/



       int min = ArrayUtils.findMin(numbers);
        System.out.println(min);
//        int getMaxNumber =
    }


}
