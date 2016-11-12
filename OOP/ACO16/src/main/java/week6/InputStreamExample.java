package week6;

import utils.Action;
import utils.TimeChecker;

import java.io.*;

/**
 * Created by gorobec on 12.11.16.
 */
public class InputStreamExample {
    public static void main(String[] args) {
       /*  InputStream is = null;

       try {
            is = new FileInputStream(new File("/home/gorobec/java/development/Teaching/ArtCode/OOP/ACO16/src/main/recources/dir1/plain.txt"));
            System.out.println(is.read());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.err.println("File not found");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(is != null){
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }*/


        long iosTime = TimeChecker.checkTime(new Action() {
            @Override
            public void run() {
                try (InputStream is = new FileInputStream(new File("/home/gorobec/java/development/Teaching/ArtCode/OOP/ACO16/src/main/recources/dir1/plain.txt"));
                     OutputStream os = new FileOutputStream(new File("/home/gorobec/java/development/Teaching/ArtCode/OOP/ACO16/src/main/recources/dir1/copy.txt"))){

                    int readByte;
                    while ((readByte = is.read()) != -1) {
                    System.out.print((char) readByte);
                        os.write(readByte);
                    }
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                    System.err.println("File not found");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });

    long iosBufferedTime = TimeChecker.checkTime(new Action() {
            @Override
            public void run() {
                try (InputStream is = new BufferedInputStream(new FileInputStream(new File("/home/gorobec/java/development/Teaching/ArtCode/OOP/ACO16/src/main/recources/dir1/plain.txt")));
                     OutputStream os = new BufferedOutputStream(new FileOutputStream(new File("/home/gorobec/java/development/Teaching/ArtCode/OOP/ACO16/src/main/recources/dir1/copy2.txt")))){

                    int readByte;
                    while ((readByte = is.read()) != -1) {
//                System.out.print((char) readByte);
                        os.write(readByte);
                    }
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                    System.err.println("File not found");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });


    long iosArrayTime = TimeChecker.checkTime(new Action() {
            @Override
            public void run() {
                InputStream is = null;
                OutputStream os = null;
                try{
                    is = new FileInputStream(new File("/home/gorobec/java/development/Teaching/ArtCode/OOP/ACO16/src/main/recources/dir1/plain.txt"));
                    os = new FileOutputStream(new File("/home/gorobec/java/development/Teaching/ArtCode/OOP/ACO16/src/main/recources/dir1/copy3.txt"));

                    int readBytes;
                    byte[] bytes = new byte[256];
                    while ((readBytes = is.read(bytes)) != -1) {
                        os.write(bytes, 0, readBytes);
                    }
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                    System.err.println("File not found");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
    long iosBufferedArrayTime = TimeChecker.checkTime(new Action() {
            @Override
            public void run() {

                try(InputStream is = new BufferedInputStream(new FileInputStream(new File("/home/gorobec/java/development/Teaching/ArtCode/OOP/ACO16/src/main/recources/dir1/plain.txt")));
                    OutputStream os = new BufferedOutputStream(new FileOutputStream(new File("/home/gorobec/java/development/Teaching/ArtCode/OOP/ACO16/src/main/recources/dir1/copy4.txt")))){

                    int readBytes;
                    byte[] bytes = new byte[256];
                    while ((readBytes = is.read(bytes)) != -1) {
                        os.write(bytes, 0, readBytes);
                    }
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                    System.err.println("File not found");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });


        System.out.printf("I/O stream time = %d ms%n", iosTime);
        System.out.printf("I/O buffered stream time = %d ms%n", iosBufferedTime);
        System.out.printf("I/O array stream time = %d ms%n", iosArrayTime);
        System.out.printf("I/O buffered array stream time = %d ms%n", iosBufferedArrayTime);

    }
}
