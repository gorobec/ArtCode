package week1.day1;

/**
 * Created by gorobec on 03.12.16.
 */
public class _03UnaryOperations {

    public static void main(String[] args) {
        int a = 5;
        int b;
        System.out.println(a);
//        a = a + 1;
//        a += 1;

//        take a -> write a to b -> add 1 to a -> rewrite a
          b = a++;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

//      take a -> add 1 to a -> rewrite a -> write a to c ->
        int c = ++a;
        System.out.println("a = " + a);
        System.out.println("c = " + c);


//        take a -> write a to b -> a minus 1 -> rewrite a
        b = a--;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

//      take a -> a minus 1 -> rewrite a -> write a to c ->
        c = --a;
        System.out.println("a = " + a);
        System.out.println("c = " + c);

    }
}
