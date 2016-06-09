package week3.day1;

/**
 * Created by gorobec on 04.06.16.
 */
public class _08Comparing {
    public static void main(String[] args) {

//         &

        int b = 10;
        int divider = 0;


//      Exception
        if(divider > 0 & b / divider > 15){
            System.out.println("Inside");
        } else {
            System.out.println("Out");
        }


        if(divider > 0 && b / divider > 15){
            System.out.println("Inside");
        } else {
            System.out.println("Out");
        }


    }
}
