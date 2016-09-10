package week2.day1;

/**
 * Created by gorobec on 10.09.16.
 */
public class _05ForLoop {
    public static void main(String[] args) {
//        for(<start>; <condition>; <way>){
//              logic
//         }

        int[] array = new int[100];

        for (int i = 0; i < array.length; i++){
            array[i] = i;
        }
        int i = 0;
//        while(true)
        for(;;i++){
            System.out.println(array[i]);

        }
    }
}
