package week2.day1;

/**
 * Created by gorobec on 23.01.16.
 */
public class PostPreIncrement {
    public static void main(String[] args) {
        int a = 5;
//        int b = a++;
        int b = a;
        a += 1;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        System.out.println("*************");

        int c = 5;
//        int d = ++c;
        c += 1;
        int d = c;

        System.out.println("c = " + c);
        System.out.println("d = " + d);

    }
}
