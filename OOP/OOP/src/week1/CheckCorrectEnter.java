package week1;

/**
 * Created by dexter on 08.11.15.
 */
public class CheckCorrectEnter {

    public static int CheckInt(String value){

        Integer temp = 0;

        try {

            temp = Integer.valueOf(value);

        } catch (NumberFormatException error){

            System.out.println("Enter only numbers");

        }
        return temp;
    }
}
