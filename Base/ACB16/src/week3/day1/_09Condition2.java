package week3.day1;

/**
 * Created by gorobec on 04.06.16.
 */
public class _09Condition2 {
    public static void main(String[] args) {
        int a = 13;
        int counter  = 0;


        if(a < 15 | ++counter > 3){
            System.out.println("Inside");
        } else {
            System.out.println("Out");
        }
        if(a < 15 | ++counter > 3){
            System.out.println("Inside");
        } else {
            System.out.println("Out");
        }
        if(a < 15 | ++counter > 3){
            System.out.println("Inside");
        } else {
            System.out.println("Out");
        }
        if(a < 15 | ++counter > 3){
            System.out.println("Inside");
        } else {
            System.out.println("Out");
        }
        System.out.println(counter);
    }
}
