package week2.day1;

import java.util.Scanner;

/**
 * Created by gorobec on 29.05.16.
 */
public class _06MethodsIntro {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int number = sc.nextInt();

//        number = number * number * number * number * number;

        int res = number; // 2
        int pow = 5;

        // 2 ^ 4
        // 2 * 2 * 2 *2
        // 2 * 2 = 4 > res
        // 4 * 2 = 8 > res
        // 8 * 2 = 16 > res
       /* for (int i = 1; i < pow; i++) {
            int oper = res * number;
            res = oper;
        }*/
       number  = (int)Math.pow(number, pow);

        System.out.println(number);

    }
}
