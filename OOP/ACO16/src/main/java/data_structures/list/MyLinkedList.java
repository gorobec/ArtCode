package data_structures.list;

import java.util.Iterator;

/**
 * Created by gorobec on 23.10.16.
 */
public class MyLinkedList<T> implements MyList<T> {

    private int size;

    private Node<T> head;

    private Node<T> tail;


    public MyLinkedList() {
    }

    @Override
    public boolean add(T o) {

        if(tail == null){
            head = tail = new Node<>(o);
            size++;
            return true;
        }

        Node<T> newNode = new Node<>(o);
        tail.next = newNode;
        newNode.previous = tail;

        tail = newNode;
        size++;

        return true;
    }

    @Override
    public boolean add(int index, Object o) {
        return false;
    }

    @Override
    public boolean clear() {
        return false;
    }

    @Override
    public boolean contains(T o) {
        return false;
    }

    @Override
    public T get(int index) {

        checkIndex(index);

        Node<T> iterator = head;

        for (int i = 1; i <= index; i++) {
            iterator = iterator.next;
        }

        return iterator.value;
    }

    private void checkIndex(int index) {
//        if(index < 0 || index >= size) throw new IndexOutOfBoundsException();
        if(index < 0 || index >= size) System.exit(-5);
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public boolean isEmpty(Object o) {
        return size == 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public boolean remove(int index) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean set(int index, Object o) {
        return false;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }


    @Override
    public Iterator<T> iterator() {
        return new MyLinkedListIterator();
    }


   private static class Node<T> {
        private Node<T> next;
        private Node<T> previous;
        private T value;


       public Node() {
       }

       Node(Node<T> next, Node<T> previous, T value) {
            this.next = next;
            this.previous = previous;
            this.value = value;
        }

        Node(T value) {
            this.value = value;
        }

         Node(Node<T> previous, T value) {
            this.previous = previous;
            this.value = value;
        }
    }

    private class MyLinkedListIterator implements Iterator<T> {

        private Node<T> iterator;

        public MyLinkedListIterator() {

            iterator = new Node<>();
            iterator.next = head;
        }

        @Override
        public boolean hasNext() {
            return iterator.next != null;
        }

        @Override
        public T next() {
            iterator = iterator.next;
            return iterator.value;
        }

    }
}
