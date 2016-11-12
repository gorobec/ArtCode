package utils;

import java.io.*;

/**
 * Created by gorobec on 12.11.16.
 */
public class FileUtils {
    public static void copy(String filePathSrc, String filePathDest) {
        checkType(filePathSrc, filePathDest);
        try (InputStream is = new BufferedInputStream(
                new FileInputStream(filePathSrc));
             OutputStream os = new BufferedOutputStream(
                     new FileOutputStream(filePathDest))) {

            int readBytes;
            byte[] bytes = new byte[1024];
            while ((readBytes = is.read(bytes)) != -1) {
                os.write(bytes, 0, readBytes);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



    private static void checkType(String filePathSrc, String filePathDest) {
        String type1 = filePathSrc.substring(filePathSrc.lastIndexOf("."));
        String type2 = filePathDest.substring(filePathDest.lastIndexOf("."));
        if(!type1.equals(type2)) throw new DifferentTypesException();
    }
}
