package week5.day2.io;

import java.io.*;
import java.net.URL;

public class FileIO {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("/home/gorobec/Java/development/ACO10");
        File newFile = new File("/home/gorobec/Java/development/ACO10/test.txt");
        newFile.delete();
//        InputStream is = new URL("https://www.google.com.ua").openStream();
        /*int oneByte;

        try(OutputStream os = new FileOutputStream(newFile);
                InputStream is = new FileInputStream(file)) {
            while ((oneByte = is.read()) != -1){
//            System.out.print((char) oneByte);
                os.write(oneByte);
            }


        }catch (IOException e){

        }
*/

    }
}
