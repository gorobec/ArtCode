package week3.day1;

/**
 * Created by gorobec on 18.09.16.
 */
public class Recursion {
    public static void main(String[] args) {
//        f(10);
//        System.out.println(factorial(5));
    }
// 5! = 5 * 4!
// 4! = 4 * 3!
// 3! = 3 * 2!
// 2! = 2 * 1!
// 1! = 1
// 0! = 1
    /*private static int factorial(int i) {

        if(i <= 1) return 1;

        return i * factorial(i - 1);
    }*/

    /*private static int factorial(int i) {
        int factorial = 1;
        for (int j = 1; j <= i; j++) {
            factorial *= j;
        }
        return factorial;
    }*/





   /* private static int factorial(int i) {

        if(i <= 1) return 1;

        return i * factorial(i - 1);
    }*/

   /* private static void f(int i) {
        if(i < 1) return;
        System.out.println(i);
        f(i - 1);
    }*/
    /*private static void f(int i) {
        if(i < 1) return;
        f(i - 1);
        System.out.println(i);
    }*/

    /*private static void f(int i) {
        if(i < 1) return;
        System.out.println(i);
        f(i - 1);
        System.out.println(i);
    }*/
}
