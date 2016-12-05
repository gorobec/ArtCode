package week6.recursion;

/**
 * Created by gorobec on 02.07.16.
 */
public class Factorial {
    public static void main(String[] args) {
//        5! = 1 * 2 * 3 * 4 * 5
//        5! = 5 * 4!( 4 * 3! (...))

        int fac = factorial(5);
        System.out.println(fac);

    }

    private static int factorial(int number) {
        if(number <= 1) return 1;
        int count = number * factorial(number - 1);
        return count;


    }
}
