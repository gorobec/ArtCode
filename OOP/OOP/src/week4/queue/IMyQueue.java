package week4.queue;

public interface IMyQueue<Object> {
    boolean add(Object object) throws QueueIsFull;
    void clear();
    Object peek();
    Object poll();
    boolean remove(Object object);
    int size();
    Object[] toArray();
}
