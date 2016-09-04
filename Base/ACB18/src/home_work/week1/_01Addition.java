package home_work.week1;

import java.util.Scanner;

/**
 * Created by gorobec on 04.09.16.
 */
public class _01Addition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, c;

        System.out.println("Enter side a: ");
        a = (int)Math.pow(sc.nextInt(), 2);
        System.out.println("Enter side b: ");
        b = (int)Math.pow(sc.nextInt(), 2);
        System.out.println("Enter side c: ");
        c = (int)Math.pow(sc.nextInt(), 2);

        if((a == b + c)
                || (b  == a + c)
                    || (c  == a + b)){
            System.out.println("Triangle is rectangle");
        } else{
            System.out.println("Triangle is not rectangle");
        }

    }
}
