package week3.day1;

/**
 * Created by gorobec on 24.12.16.
 */
public class _06StringBuilderIntro {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        StringBuilder str = new StringBuilder("0");


        for (int i = 1; i < 1_000_000; i++) {
            str.append(", ");
            str.append(i);
        }


        System.out.println(str.toString());
        long end = System.currentTimeMillis();
        long time  = end - start;
        System.out.println("Time - " + time);
    }
}
