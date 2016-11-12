import utils.FileUtils;

import java.net.MalformedURLException;

/**
 * Created by gorobec on 12.11.16.
 */
public class TestFileCopy {
    public static void main(String[] args) throws MalformedURLException {

        FileUtils.copy("/home/gorobec/java/development/Teaching/ArtCode/OOP/ACO16/src/main/recources/dir1/copy.txt",
                "/home/gorobec/java/development/Teaching/ArtCode/OOP/ACO16/src/main/recources/dir1/copy6.txt");
    }

}
