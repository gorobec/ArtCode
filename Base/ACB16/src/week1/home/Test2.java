package week1.home;


import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число:");
        int num1 = sc.nextInt();

        System.out.println("Введите второе число:");
        int num2 = sc.nextInt();

        System.out.println("Введите третье число:");
        int num3 = sc.nextInt();

        int min = 0, max = 0;

        if (num1 > num2 && num1 > num3) {
            max = num1;
        } else if (num2 > num1 && num2 > num3) {
            max = num2;
        } else if (num3 > num2 && num3 > num1) {
            max = num3;
        }

        if (num1 < num2 && num1 < num3) {
            min = num1;
        } else if (num2 < num1 && num2 < num3) {
            min = num2;
        } else if (num3 < num2 && num3 < num1) {
            min = num3;
        }


        System.out.println("Min - " + min + ", max " + max);
    }
}