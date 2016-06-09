package week1.day2;

import java.util.Scanner;

/**
 * Created by gorobec on 22.05.16.
 */
public class _10Scanner {

    public static void main(String[] args) {
//      creation
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = sc.nextLine();

        System.out.println("Enter your age: ");

        int age = sc.nextInt();



        System.out.println("Your name is - " + name + ", age - " + age);
    }
}
