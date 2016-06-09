package week6;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * Created by gorobec on 17.01.16.
 */
public class RandomAccsesF {
    public static void main(String[] args) throws IOException {
        RandomAccessFile file = new RandomAccessFile("/home/gorobec/Java/development/ACO10/copy.txt", "r");
        int readByte;
        while((readByte = file.read())!= -1){
            System.out.print((char)readByte);
        }

    }
}
