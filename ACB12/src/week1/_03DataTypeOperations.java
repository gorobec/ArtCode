package week1;

public class _03DataTypeOperations {
    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        b = b + 1;
        b += 1;

        //b -= 1;
        b--;

        int c = a + b;
//        System.out.println(c);
//        read a -> read b -> addition ->rewrite a

        a = a + b;
        System.out.println(a);

        a += b;

//        /  and %

        double d = 19;
        int e = 9;
        System.out.println(d / e);
//        logic operations >, <, >=, <=, !=,
        boolean bool = 25 == 100;

        int i = 2;
        int j = 2;
        System.out.println("Jenja");

    }
}
