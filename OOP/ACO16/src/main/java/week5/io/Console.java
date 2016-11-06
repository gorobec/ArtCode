package week5.io;

import week3.day1.FinalWord;

import java.io.File;
import java.util.Scanner;

/**
 * Created by gorobec on 06.11.16.
 */
public class Console {

    private static final String LOCATION = "/home/gorobec/java";
    public static void main(String[] args) {

        File file = new File(LOCATION);

        Scanner sc = new Scanner(System.in);





        while (true) {
            System.out.print(file.getPath() + ":$ ");

            String command = sc.nextLine();

            if (command.equals("ls")) {
                File[] files = file.listFiles();
                for (File file1 : files) {
                    System.out.println(file1.getName());
                }
            }
        }
    }
}
