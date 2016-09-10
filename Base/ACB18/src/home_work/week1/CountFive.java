package home_work.week1;

import java.util.Scanner;

/**
 * Created by gorobec on 10.09.16.
 */
public class CountFive {
    public static void main(String[] args) {
        System.out.println("Enter number");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int digit1 = number % 10;
        int digit2 = (number / 10) % 10;
        int digit3 = number / 100;

        int counter = 0;

        if(digit1 == 5)
            counter++;
        if(digit2 == 5)
            counter++;
        if(digit3 == 5)
            counter++;

        System.out.println(counter);
    }
}
