package home_work;

import java.util.Scanner;

public class HomeWork5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three number:");
        System.out.print("Number a:");
        double a = sc.nextDouble();
        System.out.print("Number b:");
        double b = sc.nextDouble();
        System.out.print("Number c:");
        double c = sc.nextDouble();
        if (a == b | b == c | a == c){
            System.out.println("There are equal pairs of numbers");
        } else {
            System.out.println("There are no equal pairs of numbers");

        }

    }
}