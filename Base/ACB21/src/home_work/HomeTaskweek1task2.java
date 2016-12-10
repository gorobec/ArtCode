package home_work;

import java.util.Scanner;

/**
 * Created by gorobec on 06.12.16.
 */
public class HomeTaskweek1task2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number 1");
        int num1 = scanner.nextInt();
        System.out.println("enter number 2");
        int num2 = scanner.nextInt();
        System.out.println("enter number 3");
        int num3 = scanner.nextInt();

        if (num1 >= 0) {
            num1 = (int) Math.pow(num1, 3);
        } else {
            num1 = 0;
        }
        if (num2 >= 0) {
            num2 = (int) Math.pow(num2, 3);

        } else {
            num2 = 0;

        }
        if (num3 >= 0) {
            num3 = (int) Math.pow(num3, 3);

        } else {
            num3 = 0;

        }

        System.out.println("Num1 = " + num1 + ", num2 = " + num2 + ", num 3 = " + num3);
    }
}