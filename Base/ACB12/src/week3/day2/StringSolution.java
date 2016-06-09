package week3.day2;

import java.util.Scanner;

/**
 * Ввести предложение с консоли, найти самое короткое и самое длинное слово.
 * Вывести найденные слова и их длину.
 */
public class StringSolution {
 public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);
  System.out.println("Enter sentence, please: ");
  String sentence = scanner.nextLine();
  String shortestWord = findShortestWord(sentence);
  String longestWord = findSLongestWord(sentence);
  System.out.printf("The longest word is %s, the shortest word is %s", longestWord, shortestWord);

 }

 private static String findSLongestWord(String sentence) {
  String[] words = sentence.split(" ");
  String longestWord = words[0];
  for (int i = 1; i < words.length; i++) {
   if(words[i].length() > longestWord.length()){
    longestWord = words[i];
   }
  }
  return longestWord;
 }

 private static String findShortestWord(String sentence) {
  String[] words = sentence.split(" ");
  String shortestWord = words[0];
  for (int i = 1; i < words.length; i++) {
      if(words[i].length() < shortestWord.length()){
       shortestWord = words[i];
      }
  }
  return shortestWord;
 }
}
