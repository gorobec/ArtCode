package week4.day1.generics;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by gorobec on 29.10.16.
 */


public class _01RawType {
    public static void main(String[] args) {


        List rawType = new ArrayList();
        List<String> list = new ArrayList<>();

        rawType = list;

        rawType.add(1);
        rawType.add("2");


        String s = list.get(0);

        System.out.println(s);

    }
}
