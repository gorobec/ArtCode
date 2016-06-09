package week2;


public class _06SimpleSort {
    public static void main(String[] args) {
        char[] letter = {'a','b', 'd', 'c'};

        for (int i = 0; i < letter.length; i++) {
            if (letter[i] > letter[i+1]) {
                char temp = letter[i +1];
                letter[i +1] = letter[i];
                letter[i] = temp;
            }
        }
    }
}
