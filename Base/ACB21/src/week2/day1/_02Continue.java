package week2.day1;

/**
 * Created by gorobec on 10.12.16.
 */
public class _02Continue {
    public static void main(String[] args) {


        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }


       /* for (int i = 0; i < arr.length; i++) {
            if(i == 13){
                continue;
            }
            System.out.println(i);
        }*/

        int i = 0;
        while (i < arr.length){
            if(i == 13){
                i++;
                continue;
            }
            System.out.print(arr[i] + " ");
            i++;
        }
    }
}
