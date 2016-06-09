package week4.linked_list;


import java.util.Iterator;

public class MyLinkedList<T> implements MyList<T>, Iterable<T>{

    private Node<T> head;
    private Node<T> tail;
    private int size;

    public T get (int index){
        Node iterator  = head;
        if(head == null){
            System.err.println("List is empty");
            return null;
        }

        int idx = 0;
        while (idx < index){
            if (iterator.getNext() == null){
                System.err.println("List is empty");
                return null;
            }
            iterator = iterator.getNext();
            idx++;

        }

        return (T)iterator.getValue();
    }


    public int size() {
        return this.size;
    }

    public boolean isEmpty() {
        /*boolean isEmpty;
        isEmpty = (size == 0);
        return isEmpty;*/
        return size == 0;
    }



    public boolean contains(T o) {
        Node iterator = head;
       while (iterator != null){
           if(iterator.getValue().equals(o))
               return true;
           iterator = iterator.getNext();
       }
        return false;
    }


    public T[] toArray() {
        Node<T> iterator = head;
        T[] array = (T[])new Object[size];
        for (int i = 0; i < size; i++) {
            array[i] = iterator.getValue();
            iterator = iterator.getNext();
        }
        return array;
    }



    public boolean add(T o) {
          if(size == 0) {
              tail = head = new Node<>(o);
        }else{
            Node<T> next = new Node<>(o);
            tail.setNext(next);
            tail = tail.getNext();
        }

        size++;
        return true;
    }

    public boolean remove(T o) {
        Node<T> iterator = head;
        while (iterator != null){
            if(iterator.getNext().getValue().equals(o)) {
                iterator.setNext(iterator.getNext().getNext());
                size--;
                return true;
            }
            iterator = iterator.getNext();
        }

        return false;
    }


    public void clear() {
        head = tail = null;
        size = 0;
    }

    @Override
    public Iterator<T> iterator() {
        return new ListIterator<>(head);
    }


    public  class ListIterator<E> implements Iterator<E>{

        Node<E> iterator = new Node<>();

        public ListIterator(Node<E> head) {
            this.iterator.setNext(head);
        }

        @Override
        public boolean hasNext() {
            return iterator.getNext() != null;
        }

        @Override
        public E next() {
            iterator = iterator.getNext();
            return iterator.getValue();
        }

        @Override
        public void remove() {

        }
    }
}
