package week1.home;

import java.util.Scanner;

/**
 * Created by gorobec on 28.05.16.
 */
public class _2_9Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write number");

        int number = scanner.nextInt();

        int first = number % 10;
        int second = (number / 10) % 10;
        int third = number / 100;

        int counter = 0;

        if(first == 5){
            counter++;
        }
        if(second == 5){
            counter++;
        }
        if(third == 5){
            counter++;
        }

        System.out.println(counter);





    }
}
