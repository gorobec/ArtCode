package week1.day2;

/**
 * Created by gorobec on 22.05.16.
 */
public class _03TestDecrement {
    public static void main(String[] args) {
        int a = 15;
//        POSTdecrement
//        left -> right
        int b = a--;
//      take a ->
        System.out.println("B = " + b);

        int c = 19;
//        PREdecrement
//        right -> left
        int d = --c;
        System.out.println("D = " + d);
    }
}
