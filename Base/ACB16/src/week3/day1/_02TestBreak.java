package week3.day1;

import java.util.Scanner;

/**
 * Created by gorobec on 04.06.16.
 */
public class _02TestBreak {
    public static void main(String[] args) {
        int pass = 123456;
        String name = "admin";

        while (true) {

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter login");
            String inputLogin = sc.nextLine();
            System.out.println("Enter pass");
            int inputPass = sc.nextInt();
            if(name.equals(inputLogin) && pass == inputPass) break;
            System.out.println("Wrong login or email");
        }
            System.out.println("Log in!!");
        }
    }
