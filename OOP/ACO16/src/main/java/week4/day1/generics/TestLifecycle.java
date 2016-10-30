package week4.day1.generics;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by gorobec on 29.10.16.
 */
public class TestLifecycle {
    public static void main(String[] args) {
        _02LifecycleOfGenerics<Object> lc = new _02LifecycleOfGenerics();

        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");

        lc.show(list);
    }

}
