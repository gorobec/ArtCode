package week2;

import java.util.Scanner;

public class _01Company {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name");
        String name = sc.nextLine();
        System.out.println("Enter number");
        int money = sc.nextInt();
        String name2 = "Someone";

        if (money > 10) {
            name = "Hello " + name;
            String employee = "Jenja";
            System.out.println("Hello " + employee);
        } else if (money < 10) {
            System.out.println("We have not enough money " + name);
            System.out.println("Fire " + name2);
        }

    }
}
