package data_structures;

import java.util.Comparator;

/**
 * Created by gorobec on 13.11.16.
 */
public interface SortedSet<E> extends Set<E> {
    Comparator<? super E> comparator();
    E first();
    E last();
}
