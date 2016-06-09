package week2.day1;


public class LoopsAndArrays {
    public static void main(String[] args) {
        int[] numbers = new int[99];
        System.out.println(numbers.length);
        for (int i = 0; i < numbers.length; i++){
            numbers[i] = i;
        }

       /* System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
        System.out.println(numbers[3]);
        System.out.println(numbers[4]);
        System.out.println(numbers[5]);
        System.out.println(numbers[6]);*/

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}

