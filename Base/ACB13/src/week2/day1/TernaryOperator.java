package week2.day1;

/**
 * Created by gorobec on 23.01.16.
 */
public class TernaryOperator {
    public static void main(String[] args) {
        int a = 25;
        int b = 45;
        int min;

        if(a < b)
            min = a;
        else
            min = b;
//        min = a > b ? b : a;
        System.out.println(min);
    }
}
