package week3.day2;

public class _01_Recursion {
    static int depth = 0;
    public static void main(String[] args) {

//        f(1);

//        System.out.println(factorial(5));

//        System.out.println(fibonacci(7));

    }

  /*  public static void f(int i) {

        if(i < 10) {
            System.out.print(i + " ");
            f(i + 1);
        }

    }*/



    /*public static void f(int i) {

        if(i < 10) {
            f(i + 1);
            System.out.print(i + " ");
        }
    }
*/


/*
    public static void f(int i) {
        if (i < 10) {
            System.out.print(i + " ");
            f(i + 1);
            System.out.print(i + " ");
        }
    }
*/



   /* public static void f(int i) {
        in(i);
        if (check(i)) {
            f(i + 1);
            System.out.print(i + " ");
        }
        out(i);
    }

    private static void out(int i) {
        depth--;
        spaces();
        System.out.println("<- (i = " + i + ")");
    }

    private static void in(int i) {
        spaces();
        System.out.println("(i = " + i + ") ->" );
        depth++;
    }

    private static boolean check(int i) {
        spaces();
        System.out.println(" (i < 10): " + (i < 10));
        return (i < 10);
    }

    private static void spaces() {
        for (int k = 0; k < depth; k++) {
            System.out.print    (" ");
        }
    }*/

  /*   public static int factorial(int i){
        int factorial = 1;
        for (int j = 1; j <= i; j++) {
            factorial *= j;
        }
        return factorial;
    }*/

/*public static int factorial(int i){

    return i < 2 ? 1 : i * factorial(i -1);
}*/


   /* public static int factorial(int i){
       if(i < 2) return i;
       return i *factorial(i -1);

    }*/

/*public static int factorial(int i) {

        return i < 2 ? i : i * factorial(i - 1);

    }*/

   /* public static int fibonacci(int i) {
        int fibonacciPosition = 1;
        int f1 = 0;
        int f2 = 1;
        if(i == 0) return f1;
        int fibonacciNumber = f1 + f2;

        while (fibonacciPosition < i) {
            fibonacciNumber = f1 + f2;
            f1 = f2;
            f2 = fibonacciNumber;
            fibonacciPosition++;
        }
        return  fibonacciNumber;
    }*/



   /* public static int fibonacci(int i) {

        if (i == 0 || i == 1) {
            return i;
        }else{
            return fibonacci(i - 1) + fibonacci(i - 2);
        }
    }*/
}
