package data_structures.java_emaples;

import java.util.*;

/**
 * Created by gorobec on 19.11.16.
 */
public class SetEx {
    public static void main(String[] args) {
        Set<String> set = new TreeSet<>();
        set.add("Apple");
        set.add("Orange");
        set.add("Melon");
        set.add("Lemon");
        set.add("Banana");
        System.out.println(set.add("Banana"));

        Iterator<String> iterator = set.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());

        }
    }
}
