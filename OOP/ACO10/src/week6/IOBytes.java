package week6;

import java.io.*;

public class IOBytes {
    public static void main(String[] args) throws IOException {
        File file = new File("/home/gorobec/Java/development/ACO10/.gitignore");
//        System.out.println(file.exists());
        File copy = new File("copy.txt");
//        copy.createNewFile();
//        System.out.println(copy.exists());
        InputStream is = new BufferedInputStream(new FileInputStream(file));
        OutputStream os = new BufferedOutputStream(new FileOutputStream(copy));

        int readByte;

        while((readByte = is.read()) != -1){
            os.write(readByte);
//            os.flush();
        }
        os.close();
//        os.flush();

    }


}
