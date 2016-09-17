package home_work;

import java.util.Scanner;

/**
 * Ввести предложение с консоли, найти самое короткое и самое длинное слово.
 Вывести найденные слова и их длину.
 */
public class _3_part1_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String[] words = text.split(" ");

        int minIdx = 0;
        int maxIdx = 0;

        int minCounter = 1;
        int maxCounter = 1;

        for (int i = 1; i < words.length; i++) {
            if(words[maxIdx].length() < words[i].length()) {
                maxIdx = i;
                maxCounter = 0;
            } else if(words[maxIdx].length() == words[i].length()){
                maxCounter++;
            }
            if(words[minIdx].length() > words[i].length()) {
                minIdx = i;
                minCounter = 0;
            } else if(words[minIdx].length() == words[i].length()){
                minCounter++;
            }
        }

        System.out.printf("Min word - %s, max word - %s\n", words[minIdx], words[maxIdx]);
        if(maxCounter > 1)
            System.out.printf("Max word occurs %d times", maxCounter);
        if(minCounter > 1)
            System.out.printf("Min word occurs %d times", minCounter);
    }
}
