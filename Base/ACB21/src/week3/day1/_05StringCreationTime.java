package week3.day1;

/**
 * Created by gorobec on 24.12.16.
 */
public class _05StringCreationTime {
    public static void main(String[] args) {

        long start = System.currentTimeMillis();
        String str = "0";

        for (int i = 1; i < 1_000_000; i++) {
            str = str + ", " + i;
        }

        long end = System.currentTimeMillis();

        long time  = end - start;
        System.out.println(str);
        System.out.println("Time - " + time);
    }
}
