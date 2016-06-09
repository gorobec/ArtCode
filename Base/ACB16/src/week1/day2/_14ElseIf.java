package week1.day2;

import java.util.Scanner;

/**
 * Created by gorobec on 22.05.16.
 */
public class _14ElseIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name");
        String name = sc.nextLine();
        System.out.println("Enter age");
        int age = sc.nextInt();
        System.out.println("Enter salary");
        int salary = sc.nextInt();

        if(age < 60 & salary > 1000){
            System.out.println("Have a nice trip");
        } else if(age > 60 & salary > 1000){
            System.out.println("Go to hospital");
        } else if (age < 60 & salary < 1000){
            System.out.println("Go work");
        } else {
            System.out.println("Sorry...");
        }

        System.out.println("Finish");
    }
}
