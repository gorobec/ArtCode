package week2;

import java.util.Scanner;

/**
 * @author Yevhen Vorobiei
 * @since JDK 1.8
 */
public class _01_SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number:");

        int num = sc.nextInt();

        if(num == 1) {
            System.out.println("1");
        } else if(num == 2) {
            System.out.println("2");
        } else if(num == 3) {
            System.out.println("3");
        } else if(num == 4) {
            System.out.println("4");
        } else {
            System.out.println("Wrong");
        }

        switch (num){
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("Number");
                break;
            default:
                System.out.println("Wrong");
                break;
        }
    }
}
