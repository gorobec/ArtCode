package week3;


import java.util.Scanner;

public class _02CheckPass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pass = 123456;
        /*System.out.println("Please, enter password: ");
        int enteredPass = scanner.nextInt();*/

        while (true) {
            System.out.println("Please, enter password: ");
            int enteredPass = scanner.nextInt();
            if(pass == enteredPass) break;

        }
            System.out.println("Congratulations, you're in system!");

    }

}
