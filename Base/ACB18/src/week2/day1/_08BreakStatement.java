package week2.day1;

import java.util.Scanner;

/**
 * Created by gorobec on 10.09.16.
 */
public class _08BreakStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int pass = 123456;

        int enteredPass;

        while (true){
            System.out.println("Enter password");
            enteredPass = sc.nextInt();
            if (enteredPass == pass)
                break;
            System.out.println("Wrong pass!!!");
        }
        System.out.println("Log in");
    }
}
