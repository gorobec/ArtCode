package week3;

import java.util.Scanner;

public class _06StringTask1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string: ");
        String s = sc.nextLine();
        String[] words = s.split(" ");
        String min = words[0];
        String max = words[0];
        for (int i = 1; i < words.length; i++) {
            if(words[i].length() < min.length()){
                min = words[i];
            }
            if(words[i].length() > max.length()){
                max = words[i];
            }
        }
        System.out.println("The shortest word - " + min + ", length - " + min.length());
        System.out.println("The longest word - " + max + ", length - " + max.length());
    }



}
