package week1.day2;

import java.util.Scanner;

/**
 * Created by gorobec on 04.12.16.
 */
public class _02Scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name:");

        String name = scanner.nextLine();

        System.out.println(name);

        System.out.println("Enter your age:");

        int age = scanner.nextInt();

        System.out.println("Hello " + name + " you are " + age + " years old.");
    }
}
