package week2.day1;

/**
 * Created by gorobec on 10.09.16.
 */
public class _01ArrayCreation {
    public static void main(String[] args) {
//        1) <data_type>[] <name> = new <data_type>[<size>];
        int[] array = new int[10];
//        2)
        int[] array2 = {1, 8, 6, 99, 25};

        System.out.println(array.length);
        System.out.println(array2.length);
    }
}
