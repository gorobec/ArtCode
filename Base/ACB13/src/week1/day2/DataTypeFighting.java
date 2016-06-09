package week1.day2;

/**
 * Created by gorobec on 17.01.16.
 */
public class DataTypeFighting {
    public static void main(String[] args) {
        long a = 3L;
        double b = 5.0;
        double c = a * b;

        byte l = 3;
        byte s = 4;
//        byte m = l + s;
        int m = l + s;

        double d = 15.8;
//        8 byte > 4 byte
        int i = (int)d;
        System.out.println(i);
    }
}
