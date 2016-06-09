package week5.day2.exceptions;


import java.util.Scanner;

public class CheckPassword {
    public static void main(String[] args)  {
        String pass = "123456";
        System.out.println("Enter password:");
        Scanner sc = new Scanner(System.in);
        String userPass = sc.nextLine();
        try {
            chekPassword(pass, userPass);
        } catch (PassIsWroongException e){
            System.out.println("Wrong pass");
            throw new NullPointerException();
        } finally {
            System.out.println("inside finally");
        }
        System.out.println("Everything good!");
    }

    private static void chekPassword(String pass, String userPass) throws PassIsWroongException {
        if (!pass.equals(userPass))
            throw new PassIsWroongException();
    }
}
