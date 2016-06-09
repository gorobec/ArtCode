package week1.day2;

import java.util.Scanner;

public class ConditionStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = sc.nextInt();

//        if - else
//        if(<condition>){ logic}
        /*boolean condition = age >= 18;
        if(condition){
            logic
        }*/

        if (age >= 18 & age < 60) {
            System.out.println("You can visit this site!");
        }else if(age >= 60){
            System.out.println("You are too old!!");
        } else {
            System.out.println("You can't visit this site!");
        }


        System.out.println("Finish!");
    }
}
