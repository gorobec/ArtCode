package week1.day2;


import java.util.Scanner;
/**
 * Created by gorobec on 10.04.16.
 */
public class _07Scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter age: ");
        double age = scanner.nextDouble();
        System.out.println("User name - " + name
                            + "\n age - " + age);

    }
}
