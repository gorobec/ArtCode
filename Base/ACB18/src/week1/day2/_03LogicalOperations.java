package week1.day2;

/**
 * Created by gorobec on 04.09.16.
 */
public class _03LogicalOperations {
    public static void main(String[] args) {
        boolean b = true;
        boolean a = false;

        boolean answer = a | b;
        System.out.println("| operator " + answer);

        answer = a & b;
        System.out.println("& operator " + answer);

        int password = 12345;
        int login = 234;

        int userPass = 23456;
        int userLogin = 234;

//                              false            &       true
        boolean validation = (password == userPass) && (login == userLogin);

//         ||               true            &       false
//        validation = (login == userLogin) || (password == userPass);

        System.out.println("validation " + validation);
    }
}
