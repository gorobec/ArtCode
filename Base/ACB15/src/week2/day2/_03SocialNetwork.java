package week2.day2;

import java.util.Scanner;

/**
 * Created by gorobec on 17.04.16.
 */
public class _03SocialNetwork {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String login = "admin";
        int pass = 123456;

        while (true){
            System.out.println("Enter pass");
            int inputPass = sc.nextInt();
            if(inputPass == pass){
                break;
            }
            System.out.println("Wrong pass!!!");
        }
        System.out.println("LogIn");
    }
}
