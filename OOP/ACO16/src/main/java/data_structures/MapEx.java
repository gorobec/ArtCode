package data_structures;

import java.util.*;

/**
 * Created by gorobec on 19.11.16.
 */
public class MapEx {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "one");
        map.put(5, "five");
        map.put(2, "three");
        map.put(4, "four");
        map.put(3, null);
        System.out.println(map.put(3, "six"));

        Iterator<Integer> keyIter = map.keySet().iterator();
        while (keyIter.hasNext()){
            System.out.println(keyIter.next());
        }

        Iterator<String> valuesIter = map.values().iterator();
        while (valuesIter.hasNext()){
            System.out.println(valuesIter.next());
        }

        java.util.Set<Map.Entry<Integer, String>> entrySet = map.entrySet();
        Iterator<Map.Entry<Integer,String>> entryIterator = entrySet.iterator();
        while (entryIterator.hasNext()){
            Map.Entry<Integer, String> entry = entryIterator.next();
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.printf("Key - %d, value - %s%n", key, value);

//            DO NOT DO SO!!!!
          /*  Integer key = entryIterator.next().getKey();
            String value = entryIterator.next().getValue();
            System.out.printf("Key - %d, value - %s%n", key, value);*/
        }
    }
}
