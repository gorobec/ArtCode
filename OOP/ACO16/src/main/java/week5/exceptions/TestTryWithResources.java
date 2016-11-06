package week5.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by gorobec on 05.11.16.
 */
public class TestTryWithResources {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)){

            scanner.nextInt();
        } catch (InputMismatchException e){
//            NOP
        }

    }
}
