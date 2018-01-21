package week2.day2;

import java.util.Scanner;

/**
 *
 *  Последовательность Фибоначчи определяется так:
 * φ0=0,  φ1=1, ..., φn=φn-1+φn-2.
 *
 * По данному числу n определите n-е число Фибоначчи φn.
 * @author Yevhen Vorobiei
 * @since JDK 1.8
 */
public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int number = sc.nextInt();

        int fibo1 = 0;
        int fibo2 = 1;

        int fibonacci = 0;

        if(number == 0 || number == 1) {
            fibonacci = number;
        }

        for (int i = 2; i <= number; i++) {
            fibonacci = fibo1 + fibo2;

            fibo1 = fibo2;
            fibo2 = fibonacci;
        }
        System.out.printf("%d fibonacci = %d", number, fibonacci);
    }
}
