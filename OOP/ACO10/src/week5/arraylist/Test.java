package week5.arraylist;

import java.util.ArrayList;


public class Test {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 15; i++) {
//            if(i == 3)
//                continue;
            list.add(i + 2);
        }
//        Integer i = new Integer(3);
        System.out.println(list);
        list.remove(16);
        System.out.println(list);

    }

}
