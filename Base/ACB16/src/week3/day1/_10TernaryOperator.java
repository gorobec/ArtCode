package week3.day1;

/**
 * Created by gorobec on 04.06.16.
 */
public class _10TernaryOperator {
    public static void main(String[] args) {
        int i = 16;
        boolean b;
        int a;

        /*if(i > 10){
            b = true;
        } else {
            b = false;
        }*/

//      <condition> ? <then> : <else>;
        a = i > 10 ? 100 : 0;

        System.out.println(a);
    }
}
