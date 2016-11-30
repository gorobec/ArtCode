package week8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by gorobec on 27.11.16.
 */
public class Lamda {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("fdfdfd");
        list.add("fdfd");
        list.add("fdfdfdfdf");
        list.add("fdfdfdf");
        Collections.sort(list, (o1, o2)-> Integer.compare(o1.length(), o2.length()));
        for (String s : list) {
            System.out.println(s);
        }
    }
}
