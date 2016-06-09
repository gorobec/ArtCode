package week2.day1;

import java.util.Scanner;

public class _05aArrayTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*int[] numbers = new int[4];
        System.out.println("Enter first number:");
        numbers[0] = scanner.nextInt();
        System.out.println("Enter second number:");
        numbers[1] = scanner.nextInt();
        System.out.println("Enter third number:");
        numbers[2] = scanner.nextInt();
        System.out.println("Enter fourth number:");
        numbers[3] = scanner.nextInt();*/

        int[]numbers = {5, 8, 9, 7};


        System.out.printf("%d, %d, %d, %d%n", numbers[0], numbers[1], numbers[2], numbers[3]);

        numbers[2] = 15;
        System.out.printf("%d, %d, %d, %d", numbers[0], numbers[1], numbers[2], numbers[3]);
    }
}
