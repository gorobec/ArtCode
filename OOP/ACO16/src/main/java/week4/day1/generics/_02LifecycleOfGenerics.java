package week4.day1.generics;

import java.util.Collection;
import java.util.List;

/**
 * Created by gorobec on 29.10.16.
 */
public class _02LifecycleOfGenerics<T> {

    public <E> void show(Collection<E> collection){
        for (E t : collection) {
            System.out.println(t);
        }
    }

    public <E>void show(List<E> list){
        for (E integer : list) {
            System.out.println(integer);
        }
    }

}
