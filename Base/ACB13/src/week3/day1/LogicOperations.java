package week3.day1;

/**
 * Created by gorobec on 30.01.16.
 */
public class LogicOperations {
    public static void main(String[] args) {
       /* int a = 18;
        int b = 33;
        int c = 45;

        if(c > b | c < (b + a++)){
            System.out.println("inside");
        }
        System.out.println(a);*/

        int d = 2;
        int e = 15;
        int f = 45;

        if(d > 0 & (f / d) > e)
            System.out.println("inside if");
        else
            System.out.println("inside else");

    }
}
