package home_work.week1;


import java.util.Scanner;

/**
 * Created by gorobec on 10.09.16.
 */
public class _11Adition {
    public static void main(String[] args) {
        System.out.println("Enter count");
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int countLast = count % 10;

        if(countLast == 1 && count >= 1 && count <= 99 && count != 11)
            System.out.println("Current count is " + count + " копейка");
        else if((countLast == 2 || countLast == 3 || countLast == 4) && count >= 1 && count <= 99 && count != 11 && count != 12
                && count != 13 && count != 14)
            System.out.println("Current count is " + count + " копейки");
        else if(count == 11 || count == 12 || count == 13 || count == 14 ||
                countLast >= 5 && countLast <= 9 && count >= 1 && count <= 99)
            System.out.println("Current count is " + count + " копеек");
        else if(countLast == 0)
            System.out.println("Current count is " + count + " копеек");
        else if(count < 1 || count > 99)
            System.out.println("Please enter valid number!");
    }
}
