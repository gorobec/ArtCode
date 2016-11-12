package week6;

import utils.Action;
import utils.TimeChecker;

import java.io.*;

/**
 * Created by gorobec on 12.11.16.
 */
public class ReaderWriter {
    public static void main(String[] args) {
        long rwTime = TimeChecker.checkTime(new Action() {
            @Override
            public void run() {
                try (Reader reader = new BufferedReader(
                        new InputStreamReader(
                                new FileInputStream(
                                        new File("/home/gorobec/java/development/Teaching/ArtCode/OOP/ACO16/src/main/recources/dir1/plain.txt")), "UTF-8"));
                     Writer writer = new FileWriter(new File("/home/gorobec/java/development/Teaching/ArtCode/OOP/ACO16/src/main/recources/dir1/copy5.txt"))) {

                    int readChar;
                    while ((readChar = reader.read()) != -1) {
                        System.out.print((char) readChar);
                        writer.write(readChar);
                    }

                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
        System.out.printf("R/W time = %d ms%n", rwTime);

    }
}
