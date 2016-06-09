package week1.day2;

/**
 * Created by gorobec on 22.05.16.
 */
public class _05LogicalOperations {
    public static void main(String[] args) {
        boolean bool1 = false;
        boolean bool2 = true;

        boolean result = bool1 | bool2;
        result = bool1 & bool2;
        System.out.println(result);

        boolean res = bool1 == false;
        boolean res2 = bool2 == false;
        boolean resultGlobal = bool1 == false & bool2 == false;
        System.out.println(resultGlobal);


    }
}
