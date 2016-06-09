package week1.day1;

/**
 * Created by Gorobec on 09.04.2016.
 */
public class _05UnaryOperations {
    public static void main(String[] args) {
        int a = 5;
//        take a -> add 1 -> rewrite a
//        a = a + 1;
//        a += 1;
        a++;
        System.out.println(a);

        int b = 6;
//        post
        b--;
//        pre
        --b;
        System.out.println(b);

    }
}
