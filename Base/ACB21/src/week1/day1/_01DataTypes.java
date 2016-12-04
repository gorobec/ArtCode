package week1.day1;

/**
 * Created by gorobec on 03.12.16.
 */
public class _01DataTypes {
    public static void main(String[] args) {

//        <type> <name> = <value>;
        int age = 15;

        int newAge;
        newAge = 25;

        byte b = 125;

        age = b;

        System.out.println(age);


        int number = 520;

        byte smallNumber = (byte) number;

        System.out.println(smallNumber);


        long bigNumber = 124566556464656L;

        float floating = 25.5F;

        double doubl = 24.1;

        char symbol = 'A';
        char symbol2 = 'B';
        char symbol3 = 'C';
        char symbol4 = 'D';

        int ascii = symbol;
//        System.out.println(ascii);

        System.out.println('A' + 'B' + 'C' + 'D');

        boolean bool = false;
        boolean bool2 = true;
        System.out.println(bool);
        System.out.println(bool2);



    }
}
