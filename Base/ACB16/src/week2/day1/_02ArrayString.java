package week2.day1;

/**
 * Created by gorobec on 29.05.16.
 */
public class _02ArrayString {
    public static void main(String[] args) {
        String name1 = "Nastja";
        String name2 = "Lida";
        String[] names = {name1, name2};


        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println("-------------");

        String name3 = names[0];
        System.out.println(name3);

    }
}
