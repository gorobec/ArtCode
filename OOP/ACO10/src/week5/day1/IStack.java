package week5.day1;


public interface IStack<E> {
    boolean isEmpty();
    E peek();
    E pop();
    E push(E e);
    int search(Object o);
}
