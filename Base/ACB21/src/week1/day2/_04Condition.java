package week1.day2;

import java.util.Scanner;

/**
 * Created by gorobec on 04.12.16.
 */
public class _04Condition {
    public static void main(String[] args) {
        String login = "admin";
        String password = "123456";

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter login");

        String enteredLogin = scanner.nextLine();

        System.out.println("Enter password");

        String enteredPassword = scanner.nextLine();


//        if(<condition>)
        if(login.equals(enteredLogin) && password.equals(enteredPassword)){
//            logic
            System.out.println("Successful logIn");
        } else {
            System.out.println("Wrong login or password");
        }







    }
}
