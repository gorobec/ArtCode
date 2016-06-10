package week4.stack;


public interface IMyStack<Object> {
    boolean isEmpty();
    Object peek() throws StackIsEmptyException;
    Object pop() throws StackIsEmptyException;
    Object push(Object object) throws StackIsEmptyException;
    int search(Object object);
}
