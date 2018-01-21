package home_work;

import java.util.Scanner;

/*
* Пользователь вводит три числа с консоли, нужно вывести на консоль наибольшее, наименьшее
* */
public class _4_2_HomeWork {
    public static void main(String[] args) {
        /*int min;
        int max;
        int number;
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите первое число:");
        max = min = sc.nextInt();

        System.out.println("Введите второе число:");
        number = sc.nextInt();
        if (number > max) {
            max = number;
        }
        if (number < min) {
            min = number;
        }

        System.out.println("Введите третье число:");

        number = sc.nextInt();
        if (number > max) {
            max = number;
        }
        if (number < min) {
            min = number;
        }
        System.out.println("Максимальное число: " + max);
        System.out.println("Мin число: " + min);*/


        int a = 15;
        int b = 8;
        int c = 3;

        int min, max;


        if(a > b & a > c) {
            max = a;
        } else if (b > a & b > c) {
            max = b;
        } else {
            max = c;
        }
//        System.out.println("Min - " + min);
        System.out.println("Max - " + max);






    }
}
