package week1.day2;

import java.util.Scanner;

/**
 * Ввести с экрана число от 1 до 12. По номеру месяца выдать сообщение о
 * времени года. Если пользователь введет недопустимое число, программа
 * должна выдать сообщение об ошибке.
 */
public class Addition7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter month number");
        int month = sc.nextInt();

        if(month == 1 || month == 2 || month == 12){
            System.out.println("Winter");
        } else if(month >= 3 && month <= 5){
            System.out.println("Spring");
        } else if(month >= 6 && month <= 8){
            System.out.println("Summer");
        } else if(month >= 9 && month <= 11){
            System.out.println("Autumn");
        } else {
            System.out.println("Wrong number");
        }
    }
}
