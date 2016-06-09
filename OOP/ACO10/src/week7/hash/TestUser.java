package week7.hash;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class TestUser {
    public static void main(String[] args) {
      /*  User user = new User();
        User user2 = new User();
        System.out.println(user);
        System.out.println(user.equals(user2));*/


        Map<String, Integer> map = new HashMap<>();
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        map.put("four", 4);
        map.put("five", 5);
        map.put("ten", 10);

//        System.out.println(map.get("one"));

        Set<String> keys = map.keySet();
       /* Iterator<String> iterator = keys.iterator();

        while (iterator.hasNext()){
            String key = iterator.next();
            System.out.println(map.get(key));
        }*/

        /*for (String key : keys) {
            System.out.println(map.get(key));
        }*/

        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();

        Iterator<Map.Entry<String, Integer>> iterator = entrySet.iterator();

        while (iterator.hasNext()){
            Map.Entry<String, Integer> entry = iterator.next();
            System.out.printf("Key - %s, value - %d\n", entry.getKey(), entry.getValue());
        }


    }
}
