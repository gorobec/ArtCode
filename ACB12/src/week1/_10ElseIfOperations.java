package week1;

import java.util.Scanner;

/**
 * Created by gorobec on 15.11.15.
 */
public class _10ElseIfOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = sc.nextInt();
        if(number % 2 == 0){
            System.out.println("Your number devides on 2");
        }else if(number % 3 == 0){
            System.out.println("Your number devides on 3");
        }
        if (number % 5 == 0){
            System.out.println("Your number devides on 5");
        }
    }

}
