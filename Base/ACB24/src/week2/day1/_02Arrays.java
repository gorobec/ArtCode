package week2.day1;

/**
 * @author Yevhen Vorobiei
 * @since JDK 1.8
 */
public class _02Arrays {
    public static void main(String[] args) {
        int[][] numbers = new int[5][10];

        /*numbers[0] = 5;
//        numbers[1] = "Hello";
        int num = numbers[0];

*/
        numbers[2] = null;

        numbers[3] = new int[]{1, 2, 3};

        numbers[4][5] = 666;

        Object[] array = new Object[0];

        array[0] = 5;
        array[1] = "Hello";


        int numb = (int)array[0];
        String a = (String)array[1];
    }
}
