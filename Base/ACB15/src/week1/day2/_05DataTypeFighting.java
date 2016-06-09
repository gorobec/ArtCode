package week1.day2;

/**
 * Created by gorobec on 10.04.16.
 */
public class _05DataTypeFighting {
    public static void main(String[] args) {
        int a = 13;
        double d = 11.9;
        long l = 12222L;
        float f = 332.5f;

        int c = (int)(d * a);
        double e = d * a;
        System.out.println(e);
        System.out.println(c);
    }
}
