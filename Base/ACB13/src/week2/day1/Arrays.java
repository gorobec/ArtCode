package week2.day1;

/**
 * Created by gorobec on 23.01.16.
 */
public class Arrays {
    public static void main(String[] args) {
//        <data_type>[] <name> = new <data_type>[<size>];
//        <data_type>[] <name> = {<element1>, ..., <element_n>};

        int[] numbers = new int[6];
        int[] numbers2 = {0, 1, 5, 9, 6};

        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        numbers[3] = 4;
        numbers[5] = 6;
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
        System.out.println(numbers[3]);
        System.out.println(numbers[4]);
        System.out.println(numbers[5]);
        int a = numbers[3];
        System.out.println(a);



    }
}
