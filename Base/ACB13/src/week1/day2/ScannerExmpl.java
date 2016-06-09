package week1.day2;


import java.util.Scanner;

public class ScannerExmpl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
         int age = sc.nextInt();
        System.out.println("Enter your name: ");
        String name = sc.next();
        System.out.println("Hello " + name + "! Your age is " + age);

    }
}
