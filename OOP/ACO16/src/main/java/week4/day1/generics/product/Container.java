package week4.day1.generics.product;

/**
 * Created by gorobec on 29.10.16.
 */
public class Container<T extends Product> {
    private T item;

    public void add(T t){
        item = t;
    }
}
