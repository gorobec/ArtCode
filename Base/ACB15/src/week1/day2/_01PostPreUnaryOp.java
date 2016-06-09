package week1.day2;

/**
 * Created by gorobec on 10.04.16.
 */
public class _01PostPreUnaryOp {
    public static void main(String[] args) {
        int a = 25;
//        take a -> b = a -> add  1 to a -> rewrite a
        int b = a++;
        System.out.println("A = " + a);
        System.out.println("B = " + b);

        int c = 25;
//        take c -> add  1 to c -> rewrite c -> d = c
        int d = ++c;
        System.out.println("C = " + c);
        System.out.println("D = " + d);
    }
}
