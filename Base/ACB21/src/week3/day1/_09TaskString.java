package week3.day1;

import utils.ArrayUtils;

/**
 * 5. Ввести предложение с консоли, каждое четное слово инвертировать, в каждом нечетном слове удалить каждую четную букву.
 Результат выводить на консоль.

 Ввод:
 Как решить это задание и не сломать себе голову?

 Вывод:
 каК еиь отэ ааи и е ьтамолс ее ?уволог
 */
public class _09TaskString {

    public static void main(String[] args) {
        String text = "Как решить это задание и не сломать себе голову?";

        String[] words = text.split(" ");

        String result = makeMagic(words);

        if(result.equals("каК еиь отэ ааи и е ьтамолс ее ?уволог")){
            System.out.println("Success!");
        } else {
            System.out.println("FAIL!");
            System.out.println(result);
        }
    }

    private static String makeMagic(String[] words) {

        for (int i = 0; i < words.length; i++) {
            if(i % 2 == 0){
                words[i] = invertWord(words[i]);
            } else {
                words[i] = deleteEvenLetter(words[i]);
            }
        }
        return ArrayUtils.makeString(words);
    }

    private static String deleteEvenLetter(String word) {

        StringBuilder sb = new StringBuilder();

        char[] letters = word.toCharArray();
        for (int i = 0; i < letters.length; i++) {
            if(i % 2 != 0){
                sb.append(letters[i]);
            }
        }
        return sb.toString();
    }

    private static String invertWord(String word) {
        StringBuilder sb = new StringBuilder();

        char[] letters = word.toCharArray();
        for (int i = letters.length - 1; i >= 0; i--) {
                sb.append(letters[i]);
        }
        return sb.toString();
    }

}
