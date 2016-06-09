package week1.day2;

import java.util.Scanner;

/**
 * Created by gorobec on 10.04.16.
 */
public class Home2_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        double number = scanner.nextDouble();


        if(number % 7 == 0 && number != 0){
            System.out.println(number * 2);
        }
    }
}
