package week1;


import java.util.Scanner;

public class _08InputData {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter age: ");

        int age = scanner.nextInt();
        System.out.print("Enter your name: ");
        String name = scanner.next();
        System.out.println("My name is "
                + name + ", I'm " + age);


    }


}
