package week2.day2;

import java.util.ArrayList;

/**
 * Created by gorobec on 16.10.16.
 */
public class ArrayListUsage {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("1");
        list.add("2");
        list.add("3");


        list.get(1);

        /*System.out.println(list.remove(2));

        System.out.println(list.remove("1"));*/


        list.set(0, "0");
        list.add(1, "1");



    }
}
