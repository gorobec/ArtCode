package home_work;


import java.util.Scanner;

public class Kopejka {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number from 1 till 99");
        int number = sc.nextInt();

        if(number >= 1 & number <= 99){
            if(number != 11 & number % 10 == 1)
                System.out.println(number + " kopejka");
            else if(number % 10 > 1 & number % 10 < 5
                    & number != 12 & number != 13 & number != 14)
                System.out.println(number + " kopejki");
            else
                System.out.println(number + " kopeek");

        } else {
            System.out.println("Wrong number");
        }
    }
}
