package week1;

import java.util.Scanner;

public class _10Division {

    public static void main(String[] args) {

//        / or %

        Scanner slave =  new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = slave.nextInt();
//      check if the number multiple to 2 and 3
        if (number % 2 == 0 && number % 3 == 0) {
            System.out.println("You were right!");
//      check if the number multiple to 2
        }  else if (number % 2 == 0) {
            System.out.println("Number devides on 2");
//      check if the number multiple to 2
        }else if (number % 3 == 0) {
            System.out.println("Number devides on 3");
//       if all condition aren't correct we make next logic
        } else {
            System.out.println("You were wrong!");
        }

    }

}
