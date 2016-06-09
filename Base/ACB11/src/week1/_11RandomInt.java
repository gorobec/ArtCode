package week1;

import java.util.Scanner;

public class _11RandomInt {
    public static void main(String[] args) {
//        double > int
        /*int pow = (int)Math.pow(3,2);
        System.out.println(pow);*/
        System.out.println("Enter number:");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

//      default return type - double
//      default value rang [0......1)
//      to change ve must multiply it
        int random = (int)(Math.random() * number);

        System.out.println(random);

    }
}
