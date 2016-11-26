package week8;

import java.util.List;

/**
 * Created by gorobec on 26.11.16.
 */
public class SomeClass<T extends Number> {

    T value;

    public void f(List<T> list){
        System.out.println("Do smth");
    }

    public T getValue() {
        return value;
    }

    public void add (T t){
        this.value = t;
    }
}
