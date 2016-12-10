package home_work;

import java.util.Scanner;

/**
 * Created by gorobec on 06.12.16.
 */
public class HomeTaskweek1task1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a");
        int a = scanner.nextInt();
        System.out.println("enter b");
        int b = scanner.nextInt();
        System.out.println("enter c");
        int c = scanner.nextInt();


        a = (int) Math.pow(a, 2);
        c = (int) Math.pow(c, 2);
        b = (int) Math.pow(b, 2);

        if (a == b + c || c == a + b || b == a + c) {
            System.out.println("Right triangle");
        } else {
            System.out.println("Triangle isn't right!");
        }
    }
}
