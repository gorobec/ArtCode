package week1.day2;

/**
 * Created by gorobec on 22.05.16.
 */
public class _02TestIncrement {
    public static void main(String[] args) {
        int a = 6;
        System.out.println("Start A = " + a);
//        take a -> b = a (write b) -> a + 1 -> rewrite a
        int b = a++;
        System.out.println("a++");
        System.out.println("A = " + a);
        System.out.println("B = " + b);


        int c = 10;
        System.out.println("Start C = " + c);
        System.out.println("++c");
//        take c -> c + 1>  rewrite c -> d = c (write d)
        int d = ++c;

        System.out.println("C = " + c);
        System.out.println("D = " + d);
    }
}
