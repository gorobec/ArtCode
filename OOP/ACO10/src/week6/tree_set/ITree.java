package week6.tree_set;

public interface ITree<T> extends Iterable<T> {
    boolean add(T t);
    boolean remove(T t);
    boolean contains(T t);
    int size();
    T findMin();
    T findMax();
    void clear();
//    void show();
}

