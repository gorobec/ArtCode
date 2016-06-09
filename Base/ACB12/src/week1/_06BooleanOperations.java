package week1;


public class _06BooleanOperations {
    public static void main(String[] args) {
        int i = 15;
        boolean b = false;
        boolean a = true;
        boolean c = a & b;
        System.out.println(c);

        boolean d = false &&  i ++ > 10;
        System.out.println(d);
        System.out.println(i);
    }

}
