package data_structures;

/**
 * Created by gorobec on 13.11.16.
 */
public interface Collection<E> extends Iterable<E>{
    int size();
    boolean isEmpty();
    boolean contains(Object o);
    <T> T[] toArray(T[] a);
    boolean add(E e);
    boolean remove(Object o);
    void clear();

}
