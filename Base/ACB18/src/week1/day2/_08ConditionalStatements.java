package week1.day2;

import java.util.Scanner;

/**
 * Created by gorobec on 04.09.16.
 */
public class _08ConditionalStatements {
    public static void main(String[] args) {
        String login = "admin";
        int pass = 123;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter login :");
        String enteredLogin = scanner.nextLine();

        System.out.println("Enter password :");
        int enteredPass = scanner.nextInt();

//        if(condition -> return boolean){
//          logic of program
//         } else {
//              another logic
//         }

        if((login.equals(enteredLogin)) && (pass == enteredPass))
            System.out.println("Your are log in system!");
         else if((login.equals(enteredLogin)) || (pass == enteredPass))
            System.out.println("Wrong pass or login");
         else
            System.out.println("Wrong pass and login");


        System.out.println("Outside if-else statement");
    }
}
