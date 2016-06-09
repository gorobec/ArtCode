package week3.day1;

import java.util.Scanner;

/**
 * Created by gorobec on 04.06.16.
 */
public class _11Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int number = sc.nextInt();


        switch (number){
            case 1:
                System.out.println("Do task 1");
                break;
            case 2:
                System.out.println("Do task 2");
                break;
            case 3:
                System.out.println("Do task 3");
                break;
            case 4:
                System.out.println("Do task 4");
                break;
            case 5:
                System.out.println("Do task 5");
                break;
            default:
                System.out.println("Wrong");
                break;

        }
    }
}
