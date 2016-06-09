package bigNumber;

import utils.ArrayUtils;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by gorobec on 30.10.15.
 */
public class EnterDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("");
        System.out.println("Enter number: ");
        int[] arr = new int[0];
        while (scanner.hasNext()) {
            String s = scanner.next();
            if(s.equals("\n")){
               // scanner.nextLine();
                break;
            }
            int i = Integer.parseInt(s);
            arr = Arrays.copyOf(arr, arr.length + 1);
            arr[arr.length - 1] = i;
        }
        System.out.println(Arrays.toString(arr));

    }
}
