package week1.day2;

/**
 * Created by gorobec on 10.04.16.
 */
public class _03LogicalOperations {
    public static void main(String[] args) {
//        boolean a and boolean b -> compare a with b
//        | - OR if one of a or b = true -> true
        boolean a = true;
        boolean b = false;
        System.out.println(a | b);
//        & - AND
//        if both a and b = true -> return true, else -> false
        System.out.println(a & b);

//        == equals
//        if a equal b -> true, else -> false
        System.out.println(a == b);

//        != not equal
//        if a not equal b -> true
        System.out.println(a != b);
    }
}
