package week2.day1;

/**
 * Created by gorobec on 16.04.16.
 */
public class _02Arrays {
    public static void main(String[] args) {
//        <DT>[] <name> = new <DT>[<size>];
        String[] names = new String[8];

        names[0] = "Oksana";
        names[1] = "Vitalij";
        names[2] = "Aleksandr";
        names[3] = "Artem";
        names[4] = "Serafima";
        names[5] = "Aleksej";
        names[6] = "Viktor";
        names[7] = "Vova";

        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);


        int[] numbers = {1, 2, 3, 4, 5, 6, 7};

        System.out.println(numbers.length);

    }
}
