package week1.day1;

import java.util.Scanner;

/**
 * @author Yevhen Vorobiei
 * @since JDK 1.8
 */
public class Input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter name:");
        String name = scanner.nextLine();
        System.out.println("Enter age:");
        int age = scanner.nextInt();

        System.out.println("Hello " + name + "! You are " + age + " years old!");

    }
}
