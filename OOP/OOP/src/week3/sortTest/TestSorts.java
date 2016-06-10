package week3.sortTest;

import utils.ArraySorts;
import utils.ArrayUtils;
import utils.TimeAction;
import utils.TimeCounter;

import javax.swing.*;
import java.util.Arrays;

public class TestSorts {
    public static void main(String[] args) {
        int[]arr = ArrayUtils.createRandomArray(10000, 101);
        ArrayUtils.showArray(arr);
        long bubble = new TimeCounter().countEvent(new BubbleSort(arr));
        long select = new TimeCounter().countEvent(new SelectSort(arr));
        long insert = new TimeCounter().countEvent(new InsertSort(arr));
        System.out.printf("BubbleSort time - %d\nSelectSort time - %d\nInsertSort time - %d\n", bubble, select, insert);
    }
}
class BubbleSort implements TimeAction{
    int[] array;
    public BubbleSort(int[] array) {
        this.array = array;
    }

    @Override
    public void callAction() {
        int[]bubble = ArraySorts.bubbleSort(array);
        System.out.println(Arrays.toString(bubble));
    }
}
class SelectSort implements TimeAction{
    int[] array;
    public SelectSort(int[] array) {
        this.array = array;
    }

    @Override
    public void callAction() {
        int[]select = ArraySorts.selectSort(array);
        System.out.println(Arrays.toString(select));
    }
}
class InsertSort implements TimeAction{
    int[] array;

    public InsertSort(int[] array) {
        this.array = array;
    }

    @Override
    public void callAction() {
        int[] insert = ArraySorts.insertSort(array);
        System.out.println(Arrays.toString(insert));
    }
}