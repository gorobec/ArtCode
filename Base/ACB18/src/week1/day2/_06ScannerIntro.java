package week1.day2;

import java.util.Scanner;

/**
 * Created by gorobec on 04.09.16.
 */
public class _06ScannerIntro {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("Enter your name, please :");
//        read line of text
         String name = sc.nextLine();


//        read number
        System.out.println("Enter your age");
        int age = sc.nextInt();
        System.out.println("Hello " + name + "! You are " + age + " year old.");
    }
}
