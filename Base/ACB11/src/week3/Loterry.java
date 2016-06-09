package week3;

import java.util.Arrays;
import java.util.Scanner;

public class Loterry {

    public static void main(String[] args) {

        bingo();

    }

    public static void bingo() {
        int[] lotNumbers = genRandomDigits();
        lotNumbers = sortArray(lotNumbers);
        int[]userTicket = inputUserTicket();
        userTicket = sortArray(userTicket);
        int equal = findEqual(lotNumbers, userTicket);

        System.out.println("Lot numbers: " + Arrays.toString(lotNumbers));
        System.out.println("Your numbers: " + Arrays.toString(userTicket));

        showCongratulations(equal);
    }

    public static void showCongratulations(int equal) {
        System.out.println("Number of equal digits is - " + equal);
        switch (equal) {
            case 0:
                System.out.println("You looser!");
                break;
            case 1:
                System.out.println("You looser!");
                break;
            case 2:
                System.out.println("You looser!");
                break;
            case 3:
                System.out.println("You win! But only new ticket :(");
                break;
            case 4:
                System.out.println("You win!! Take your 100$ ");
                break;
            case 5:
                System.out.println("You win! Take your 5000$");
                break;
            case 6:
                System.out.println("Run Forest, run. All people wont to kill you!!");
                break;
        }
    }

    public static int findEqual(int[] loterry, int[] ticket) {
        int equals = 0;

        for (int i = 0; i < loterry.length; i++) {
            for (int j = 0; j < ticket.length; j++) {
                if (loterry[i] == ticket[j]) {
                    equals++;
                }
            }
        }
        return equals;
    }

    private static int[] inputUserTicket() {

        Scanner sc = new Scanner(System.in);
        int[] arrOfNum= new int[6];
        for (int i = 0; i < arrOfNum.length; i++) {
            System.out.println("Enter number: ");
            arrOfNum[i] = sc.nextInt();

            if(arrOfNum[i] < 1 || arrOfNum[i] > 42) {
                System.out.println("Wrong number");
                i--;
            }

            for (int j = 0; j < i; j++) {
                if(arrOfNum[i] == arrOfNum[j]) {
                    System.out.println("Number repeat!");
                    i--;
                }
            }

        }
       return arrOfNum;
    }

    private static int[] sortArray(int[] lotNumbers) {
        for (int j = lotNumbers.length - 1; j >= 0; j--) {
            for (int i = 0; i < j; i++) {
                if(lotNumbers[i] > lotNumbers[i + 1]) {
                    int tmp = lotNumbers[i + 1];
                    lotNumbers[i + 1] = lotNumbers[i];
                    lotNumbers[i] = tmp;
                }
            }
        }
        return lotNumbers;
    }

    private static int[] genRandomDigits(){
        int[]arr = new int[6];
        for(int i = 0; i < arr.length; ++i){
            int temp = genRandom(1, 42);
            if(checkOfSame(arr, temp))
                arr[i] = temp;
            else --i;
        }
        return arr;
    }

    private static boolean checkOfSame(int[]arr, int num){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == num)
                return false;
        }
        return true;
    }
    public static int genRandom(int min, int max) {

        return (int) (min + Math.random() * (max + 1 - min));
    }
}
