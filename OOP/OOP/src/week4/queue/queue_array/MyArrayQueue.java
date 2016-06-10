package week4.queue.queue_array;

import week4.queue.IMyQueue;
import week4.queue.QueueIsFull;


public class MyArrayQueue implements IMyQueue {

    private Object[] queue;
    private int head;
    private int tail;
    private int elements;

    public MyArrayQueue(int capacity) {
        this.queue= new Object[capacity];
        this.head = this.tail = 0;
        this.elements = 0;
    }

    @Override
    public boolean add(Object o) throws QueueIsFull {
        if(queue.length == elements) throw new QueueIsFull();
        if(o == null) return false;
        queue[tail] = o;
        elements++;
        updateTail();
        return true;
    }

    private void updateTail() {
        if(tail < queue.length - 1) tail++;
        else tail = 0;
    }

    @Override
    public void clear() {
        for (Object o : queue) {
            o = null;
        }
        head = tail = 0;
    }

    @Override
    public Object peek() {
        return queue[head];
    }

    @Override
    public Object poll() {
        Object polled = peek();
        queue[head] = null;
        if (polled != null){
            elements--;
            this.head = updateHead(head);
        }
        return polled;
    }

    private int updateHead(int head) {
        if(head == queue.length - 1) return  0;
        else return ++head;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public int size() {
        return elements;
    }

    @Override
    public Object[] toArray() {
        return convertToArray();
    }

    private Object[] convertToArray() {
        Object[] array = new Object[elements];
        if(elements == 0) return array;
        int counter = elements;
        int step = head;
        int i = 0;
        while (counter > 0){
            array[i] = queue[step];
            i++;
            step = updateHead(step);
            counter--;
        }
        return array;
    }

}
