package week1;

public class _02DataTypes {
    public static void main(String[] args) {
//        <data_type> <variable_name>;
//        <var_name> = <data>;
//        or <data_type> <variable_name> = <data>;

        int age;
        age = 26;


//        long and float ends with L(l) or F(f);
        long bigNumber = 255555555555555l;
        float newCost = 24.8F;


        double cost = 24.8;

//      we can't correctly put 4 bytes in 1 byte
        byte smallNum = (byte)age;

        System.out.println(smallNum);



        char symbol = 'A';
        char symbol2 = 'B';
        char symbol3 = 'C';
        char symbol4= 'D';

        System.out.print(symbol + "" + symbol2);
        System.out.print(symbol3);
        System.out.println(symbol4);

        boolean isTrue;
        isTrue = false;

        boolean isFalse = 25 < 1;

       System.out.println(isFalse);

        String name = "Jenja";
        System.out.println(name);
    }
}
