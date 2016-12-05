package week8.date;

import java.io.File;
import java.util.Date;

/**
 * Created by gorobec on 16.07.16.
 */
public class DateTest {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);

        File file = new File("/home/gorobec/Java/development/Teaching/ArtCode/ACO13/src/resources/9a5f72788d9e0e5ac0d0e585e3b3632f.png");
        System.out.println(file.lastModified());

        Date modTime = new Date(file.lastModified());
        System.out.println(modTime);


    }
}
