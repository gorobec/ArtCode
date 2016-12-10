package week2.day1;

/**
 * Created by gorobec on 10.12.16.
 */
public class _03Break {
    public static void main(String[] args) {
        int[] arr = new int[100];


        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }

        for (int i = 0; i < arr.length; i++) {
            if(i == 13){
                break;
            }
            System.out.println(i);
        }
    }
}
