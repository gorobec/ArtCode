package week2.day1;

/**
 * Created by gorobec on 28.05.16.
 */
public class _01Array {
    public static void main(String[] args) {
//      <data_type>[] <variable_name> = {<data1>,<data2>,<data3>};

        int[] numbers = {1, 15, 12, 0};




//      <data_type>[] <variable_name> = new <data_type>[<size>];

        int[] numbers2 = new int[4];
        boolean[] isSomething = new boolean[5];

//        int, byte, short, long -> 0
//        double, float -> 0.0
//        char -> \u0000
//        boolean -> false


        numbers2[0] = 13;


//        ArrayIndexOutOfBoundsException
//        numbers2[4] = 19;


        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
        System.out.println(numbers[3]);
//        ArrayIndexOutOfBoundsException
//        System.out.println(numbers[4]);


    }
}
