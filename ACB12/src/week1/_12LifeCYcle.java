package week1;

import java.util.Scanner;

/**
 * Created by gorobec on 15.11.15.
 */
public class _12LifeCYcle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = "Nikita";
        System.out.println("Enter your age:");
        int age = sc.nextInt();
        System.out.println("Enter money:");
        long money = sc.nextLong();
        System.out.println("How do you fill?");
        int health = sc.nextInt();
        int healthLimit = 30;
        boolean isWeatherGood = true;
        int tourPriceEgypt = 25_000;
        int tourPriceTurkey = 35_000;
        int tourPriceGrandma = 100;

        if (health > healthLimit) {
            System.out.println("I'll stay home");
        } else {
            System.out.println("I need a rest");

            if (money >= tourPriceTurkey && age < 80) {
                System.out.println("I'm going in Turkey!");
            } else if (money >= tourPriceEgypt) {
                System.out.println("I'm going in Egypt!");
            } else if (money >= tourPriceGrandma) {
                System.out.println("I'm going to village :(");
            } else {
                System.out.println("Stay home");
            }

        }


    }
}
