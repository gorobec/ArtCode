package week1.day2;

import java.util.Scanner;

/**
 * Created by gorobec on 22.05.16.
 */
public class _13ConditionalStatements {
    public static void main(String[] args) {
        String name = "Kolja";
        int pass = 123456;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter password ");
        int enteredPass = sc.nextInt();


//        if true -> do logic
        boolean isEqual = pass == enteredPass;
        if(isEqual){
//       logic
            System.out.println("Enter successful, welcome " + name);
        } else {
//            logic
            System.out.println("Wrong password");
        }


    }
}
