package week1.day2;

/**
 * Created by gorobec on 10.04.16.
 */
public class _10LogicalAnd {
    public static void main(String[] args) {
        int divider = 0;
        int salary = 50;
        int result;

        if(divider != 0 && salary / divider > 15){
            int a = 5;
            result = salary / divider;
            System.out.println(result);
        } else{
            System.out.println("divider = 0");
        }
    }
}
