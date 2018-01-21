package home_work;

import java.util.Scanner;

public class Week1_additional_4 {
    public static void main(String[] args) {
        System.out.println("Enter speed in km/h");
        Scanner scanner = new Scanner(System.in);
        double speedInKmH = scanner.nextDouble();
        System.out.println("Enter speed in m/s");
        double speedInMSec =
                scanner.nextDouble();
        if (speedInKmH > speedInMSec * 3.6)
            System.out.println("Speed in km/h is bigger");
        else if (speedInKmH == speedInMSec * 3.6)
            System.out.println("They are equal");
        else
            System.out.println("Speed in m/s is bigger");

    }
}