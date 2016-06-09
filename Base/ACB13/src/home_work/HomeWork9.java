package home_work;

import java.util.Scanner;

public class HomeWork9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Your ideal weight!");
        System.out.print("Who you are? If you are female, type 1 if you are male, type 2:");
        int sex = sc.nextInt();
        System.out.print("Enter your height (sm.):");
        int height = sc.nextInt();
        System.out.print("Enter your weight (kg):");
        int weight = sc.nextInt();
        int index = 0;
        if (sex == 1) {
             index = height - 110;
        } else if (sex == 2) {
            index = height - 100;
        }
        if (weight == index) {
            System.out.print("Your weight ideal " + index + " Recommendation: Be Happy");
        } else if (weight < index) {
            System.out.print("Your weight ideal: " + index + " Recommendation: You need to gain weight");
        } else if (weight > index) {
            System.out.print("Your weight ideal: " + index + " Recommendation: You need to lose weight");
        }
    }
}