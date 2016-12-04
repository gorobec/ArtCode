package week1.day2;

/**
 * Created by gorobec on 04.12.16.
 */
public class _06Ternary {
    public static void main(String[] args) {

        int a = 16;
        int b = 161;

        /*if(a > b){
            System.out.println(a);
        } else {
            System.out.println(b);
        }
*/
        int maxNumber = a > b ? a : b;
        System.out.println(maxNumber);

    }
}
