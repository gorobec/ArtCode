package week1;

public class _03DataTypeOperations {
    public static void main(String[] args) {

        int a = 15;
        int b = 20;


        // create, read, write
        int c = a + b;
        System.out.println(c);
        c = b - a;
        System.out.println(c);

        b = 15;

        b  = b - 5;

        b -= 5;
        int d = 101/10;
        System.out.println(d);

        double g = 101.0/10;
        System.out.println(g);

        int f = 101 % 10;
        System.out.println(f);

        f = 100 * 5;
        f*= 5;
//      make pow  = Math.pow(argument,pow);
//      return double!!!
//        cast to int (int)
        f = (int)Math.pow(5,3);
        System.out.println(f);
//        loss of accuracy
        int r = 999999999;
        float k = r;
        System.out.println(k);

        boolean z = 20 != 30;
        System.out.println(z);

    }
}
