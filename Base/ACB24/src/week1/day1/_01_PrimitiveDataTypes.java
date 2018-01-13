package week1.day1;

/**
 * @author Yevhen Vorobiei
 * @since JDK 1.8
 */
public class _01_PrimitiveDataTypes {
    public static void main(String[] args) {
        byte age = 15;
        byte age2 = 15;

        int result = age * age2;

        System.out.println(result);

        int salary = 40000;

        short newSalary = (short) salary;


        int i;

        i = 15;

        char letter = 'A';
        char letter2 = 'B';

        int a = letter + letter2;

        System.out.println(newSalary);
        System.out.println(letter);
        System.out.print(a);
    }
}
