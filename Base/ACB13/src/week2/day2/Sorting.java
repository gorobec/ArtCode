package week2.day2;


import utils.ArrayUtils;

public class Sorting {
    public static void main(String[] args) {
        int[] numbers = {5, 4, 3, 2, 1};

        for (int j = numbers.length - 1; j >= 0; j--) {
            for (int i = 0; i < j; i++) {
                if(numbers[i] > numbers[i + 1]){
//                swap
                    int temp = numbers[i + 1];
                    numbers[i + 1] = numbers[i];
                    numbers[i] = temp;
                }
            }
        }


        ArrayUtils.showArray(numbers);
    }
}
