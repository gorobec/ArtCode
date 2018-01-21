package week2;

/**
 * @author Yevhen Vorobiei
 * @since JDK 1.8
 */
public class Lottery {
    public static void main(String[] args) {
        int[] numbers = generateRandomNumbers(6, 1, 42);

        ShiftArray.printArray(numbers);
    }

    private static int[] generateRandomNumbers(int size, int min, int max) {
        int[] array = new int[size];

        int counter = 0;

        while (counter < size) {
            int randomNumber = generateRandomNumber(min, max);
            if(!contains(array, randomNumber, counter)) {
//
                array[counter] = randomNumber;
                counter++;
            }
        }

        return array;
    }

    private static boolean contains(int[] array, int randomNumber, int limit) {

        for (int i = 0; i < limit; i++) {
            if(array[i] == randomNumber){
                return true;
            }
        }
        return false;
    }

    private static int generateRandomNumber(int min, int max) {
//        todo implement random number generation
        return (int)(min + Math.random() * (max - min));
    }
}
