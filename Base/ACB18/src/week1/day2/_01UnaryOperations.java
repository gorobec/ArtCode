package week1.day2;

/**
 * Created by gorobec on 04.09.16.
 */
public class _01UnaryOperations {
    public static void main(String[] args) {
        int a = 5;

        int b;

//        a = a + 1;

//        a += 1;


//        b = a -> a rewrite a + 1
        b = a++;

//        take a -> add 1 -> rewrite a -> take c -> write a into  c

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        int c = ++a;
        System.out.println("c = " + c);


        int x = 10;

        int y = x--;

        System.out.println("x = " + x);
        System.out.println("y = " + y);
        x = 10;

        int z = --x;
        System.out.println("x = " + x);
        System.out.println("z = " + z);
    }
}
