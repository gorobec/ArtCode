package week1.day1;

/**
 * Created by gorobec on 03.12.16.
 */
public class _05LogicalOperations {
    public static void main(String[] args) {

        int password = 123456;
        int password2 = 123;
        char login = 'A';

        int enteredPass = 12345;
        int enteredPass2 = 123;
        char enteredLogin = 'A';


        boolean resultPass = password == enteredPass; // false
        boolean resultPass2 = password2 == enteredPass2; // false
        boolean resultLogin = login == enteredLogin; //true

        // true & false -> false
        // true | false -> true
        boolean canLogin = resultPass && resultPass2 && resultLogin ;

        System.out.println("Can user login? - " + canLogin);

    }
}
