package week1.day2;

import java.util.Scanner;

/** Определить, является ли шестизначное число "счастливым" (сумма
 первых трех цифр равна сумме последних трех цифр).
 */
public class LuckyNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number (6 digits): ");
        int number = sc.nextInt();
//        123456

        int first = number / 100000;// 1
        int second = (number / 10000) % 10;// 2
        int third = (number / 1000) % 10;
        int fourth = (number / 100) % 10;
        int fifth = (number / 10) % 10;
        int sixth = number % 10;

        int firstPart = first + second + third;
        int secondPart = fourth + fifth + sixth;

        if(number >= 100000 && number <= 999999) {

            if (firstPart == secondPart) {
                System.out.println("Lucky number");
            } else {
                System.out.println("Maybe next time");
            }

        } else {
            System.out.println("Wrong number");
        }
    }
}
