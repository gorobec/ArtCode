package week2.day2;


import java.util.Scanner;

public class _05CountEight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number:");
        int number = scanner.nextInt();
        int counter = 0;
        while (true){
            if(number == 0) {
                break;
            }
            int tmp = number % 10;
            if (tmp == 8){
                counter++;
            }
            number /= 10;
        }
        System.out.println(counter);
    }
}
