package home_work.week3;

import utils.ArrayUtils;
import utils.StringUtils;

import java.util.Scanner;

/**
 * Ввести предложение с консоли, каждое четное слово инвертировать,
 в каждом нечетном слове удалить каждую четную букву.
 Результат выводить на консоль.

 Ввод:
 Как решить это задание и не сломать себе голову?

 Вывод:
 каК еиь отэ ааи и е ьтамолс ее ?уволог.
 */
public class _05String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String[] words = text.split(" ");
        for (int i = 0; i < words.length; i++) {
            if(i % 2 == 0){
                words[i] = StringUtils.wordInvertion(words[i]);
            } else {
                words[i] = StringUtils.deleteEvenLetter(words[i]);
            }
        }
        ArrayUtils.printArray(words);
    }
}
