package week1.day2;

import java.util.Scanner;

/**
 * Created by gorobec on 04.09.16.
 */
public class _11Task {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ibizaPrice = 15_000;
        int israelLimit = 20_000;
        String name;
        int age;
        boolean health;
        int salary;

        System.out.println("Enter your name: ");
        name = sc.nextLine();

        System.out.println("Enter your age: ");
        age = sc.nextInt();

        System.out.println("Enter your health: ");
        health = sc.nextBoolean();

        System.out.println("Enter your salary: ");
        salary = sc.nextInt();

        if(age >= 18 && age <= 60){
            if(salary > ibizaPrice && health) {
                System.out.println(name + " Go Ibiza. Young and rich");
            }else if(salary > ibizaPrice && !health){
                System.out.println(name + " Go BSP, young and rich, but illness");
            } else {
                System.out.println(name + " Go to granny, you're young, but poor");
            }

        } else if(age < 18){
            System.out.println(name + " Go to granny, you're young");

        } else{
            if(health && salary > ibizaPrice){
                System.out.println(name + " Go Ibiza. Health and rich");
            } else if(!health && salary > israelLimit){
                System.out.println(name + " Go Israel. Rich but ill");
            } else if (health && salary < ibizaPrice){
                System.out.println(name + " Go to granny, health but poor");
            } else{
                System.out.println("BSP :(");
            }
        }
    }
}
