package home_work.week2;

import java.util.Scanner;

/**
 * Created by gorobec on 28.01.16.
 */
public class Ex5_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = sc.nextInt();
        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
//            factorial = factorial * 1;
        }
        System.out.println(factorial);
    }
}
