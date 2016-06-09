package week1.day2;

import java.util.Scanner;

/**
 * Created by gorobec on 10.04.16.
 */
public class _09ConditionalStatements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*System.out.print("Enter name: ");
        String name = sc.nextLine();*/
        System.out.print("Enter age: ");
        int age = sc.nextInt();
//      if(condition){
//          if condition == true ->
//          logic
        if (age < 18 | age > 60) {
            System.out.println("You can't visit this site");
        } else {
            System.out.println("Norm");
        }
    }
}
