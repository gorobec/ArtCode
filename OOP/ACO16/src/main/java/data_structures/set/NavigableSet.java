package data_structures.set;

/**
 * Created by gorobec on 13.11.16.
 */
public interface NavigableSet<E> extends SortedSet<E> {
    E lower(E e);
    E floor(E e);
    E ceiling(E e);
    E higher(E e);
    E pollFirst();
    E pollLast();
}
