package week6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IOChars {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String symbol = br.readLine();
        int i = Integer.parseInt(symbol);
        char c = 65;
//        int i = Integer.parseInt(br.readLine());
        System.out.println(i);
        System.out.println(c);
    }
}
