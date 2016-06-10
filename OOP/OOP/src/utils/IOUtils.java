package utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class IOUtils {

    public static void readFullyByBytes (InputStream is) {
        int oneByte;
        try {
            while ((oneByte = is.read()) != -1) {
                System.out.print((char) oneByte);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static String readAll (InputStream inputStream) {
        StringBuffer sb = new StringBuffer(); //mutable
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));

        String line = null;

        try {
            while ((line = bufferedReader.readLine()) != null) {
                sb.append(line + "\n");

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sb.toString();
    }
}
