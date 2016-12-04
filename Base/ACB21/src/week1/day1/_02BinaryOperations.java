package week1.day1;

/**
 * Created by gorobec on 03.12.16.
 */
public class _02BinaryOperations {
    public static void main(String[] args) {
        int a = 15;
        int b = 3;

        int c = a + b;

        System.out.println(a + b);
        System.out.println("c = " + c);


        int d = c - 6;

        System.out.println("d = " + d);


        int y = d * 2 + 1;

        System.out.println("y = " + y);

        int f = y / 2;

        System.out.println("f = " + f);


        int g = 35 % 2;
        System.out.println("number equals " + g);


        System.out.println(y);

//        y = y * 2;
        y *= 2;

        System.out.println(y);

        y /= 2;
//        y = y / 2;
        System.out.println(y);


        int z = -25;

        double result = z * 0.5;

        System.out.println(result);
    }
}
