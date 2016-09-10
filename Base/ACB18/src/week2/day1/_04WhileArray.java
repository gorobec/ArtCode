package week2.day1;

/**
 * Created by gorobec on 10.09.16.
 */
public class _04WhileArray {
    public static void main(String[] args) {
        int[] array = new int[1000];
        int number = 0;

        while (number < array.length){
            array[number] = number;
            System.out.println(array[number]);
            number++;
        }
        /*int cellNumber = 0;

        while (cellNumber < array.length){
            System.out.println(array[cellNumber]);
            cellNumber++;
        }*/
    }
}
