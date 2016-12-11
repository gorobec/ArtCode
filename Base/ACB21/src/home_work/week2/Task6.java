package home_work.week2;

import java.util.Scanner;

/**
 * Игра "Угадай число":
 * Програма генерирует случайное, целое число в диапазоне от 25 до 125 (включительно).
 * Пользователь пытается его угадать.
 * Число попыток ограничено 5.
 * Если пользователь ввел неверное число, программа дает подсказу (больше/меньше).
 * Придумать разные варианты ответов, при отгадывании с первой попытки, нескольких попыток, в случае проигрыша.
 */
public class Task6 {
    public static void main(String[] args) {
        int random = (int)(25 + Math.random() * (126 - 25));

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int userNumber = sc.nextInt();

        for (int i = 0; i < 7; i++) {
            if(userNumber == random){
                System.out.println("Congrats!");
                break;

            } else if (userNumber > random){
                System.out.println("Enter lower number");
            } else {
                System.out.println("Enter higher number");
            }
            userNumber = sc.nextInt();
        }
    }
}
