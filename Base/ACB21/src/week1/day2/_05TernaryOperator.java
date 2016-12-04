package week1.day2;

import java.util.Scanner;

/**
 * Created by gorobec on 04.12.16.
 */
public class _05TernaryOperator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = sc.nextInt();

//        condition(age >= 18) ? return value(true) : return value(false)


         boolean result = age >= 18 ? true : false;

        /*if(age >= 18){
            result = true;
        } else {
            result = false;
        }*/

        System.out.println("Do you allowe to visit night club - " + result);


    }
}
