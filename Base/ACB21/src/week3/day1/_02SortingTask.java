package week3.day1;

import utils.ArrayUtils;

/**
 * Created by gorobec on 24.12.16.
 */
public class _02SortingTask {
    public static void main(String[] args) {
        String text = "Hello my name is Vova";

        String[] words = text.split(" ");

        ArrayUtils.bubbleSort(words);

        ArrayUtils.printArray(words);
    }
}
