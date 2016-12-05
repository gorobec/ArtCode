package week5.io.filesystem;

import java.io.File;
import java.util.Scanner;

/**
 * Created by gorobec on 26.06.16.
 */
public class FilesIntro {
    public static void main(String[] args) {
        File file = new File("/home/gorobec/Java/development/Teaching/ArtCode/ACO13/toDel");

        for (File file1 : file.listFiles()) {
            file1.delete();
        }

        System.out.println(file.delete());

    }
}
