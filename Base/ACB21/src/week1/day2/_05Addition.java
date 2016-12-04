package week1.day2;

/**
 * Даны три числа a, b, c. Определить, имеется ли среди них хотя бы одна
    пара равных
 */
public class _05Addition {
    public static void main(String[] args) {
        int a = 5;
        int b = 15;
        int c = 5;


        if(a == b && a == c && b == c){
            System.out.println("All numbers are equal");
        } else if (a == b || a == c || b == c){
            System.out.println("One pair is equal");
        } else {
            System.out.println("No one pair is equal");
        }
    }
}
