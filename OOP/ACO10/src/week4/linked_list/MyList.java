package week4.linked_list;


public interface MyList<T> {
//    T get (int index);
    int size();
    boolean isEmpty();
    boolean contains(T o);
    T[] toArray();
    boolean add(T o);
    boolean remove(T o);
    void clear();
}
