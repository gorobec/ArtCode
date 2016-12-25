package week3.day2.unit_tests;

/**
 * Created by gorobec on 25.12.16.
 */
public class CodingBat {

    public static int count7(int n) {
        int count = 0;

        if(n == 0) return count;

        if(n % 10 == 7) count++;

        return count + count7(n / 10);
    }
}
