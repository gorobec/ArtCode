package week7;

/**
 * Created by gorobec on 10.07.16.
 */
public class ChangeNumbers {
    public static void main(String[] args) {
        int x = 15;
        int y = 5;

        x = x ^ y;
        y = y ^ x;
        x = x ^ y;


        /*x = x - y;
        y = y + x;
        x = y - x;*/

        System.out.println(x);
        System.out.println(y);
    }
}
