package week1;

import java.util.Scanner;

public class _08InputData {
    public static void main(String[] args) {

    // create some object type - "Scanner" using word "new",
    // create reference on it, by giving name (name = inputHelper) Scanner inputHelper = new Scanner(System.in);
    // System.in mean that we will get information from console
        Scanner inputHelper = new Scanner(System.in);
        System.out.println("Enter name");
        String name = inputHelper.nextLine();
        System.out.println(name);


    }
}
