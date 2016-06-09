package week2.day1;

import java.util.Scanner;

/**
 * Created by gorobec on 23.01.16.
 */
public class ScannerArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = sc.nextInt();

        int[] digits = new int[3];

        digits[0] = number / 100;
        digits[1] = (number / 10) % 10;
        digits[2] = number % 10;
        for (int i = 0; i < digits.length; i++) {
            System.out.print(digits[i] + " ");
        }
    }
}
