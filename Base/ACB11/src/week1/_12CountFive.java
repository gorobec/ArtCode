package week1;

import java.util.Scanner;

public class _12CountFive {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = sc.nextInt();

//        create counter
        int count = 0;

        int a = number / 100; // a = first digit
        int b = (number % 100) / 10; // b = second digit
        int c = number % 10; // c = third digit



//        your logic!!!



        System.out.println(count);
    }
}
