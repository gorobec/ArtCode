package data_structures;

import data_structures.list.MyList;

import java.util.Iterator;

/**
 * Created by gorobec on 30.10.16.
 */
public class MyAL<T> implements MyList<T>{

    private T[] elementData;
    private int size;
    private static final int DEFAULT_CAPACITY = 10;

    public MyAL(int size) {
        this.elementData = (T[]) new Object[size];
    }

    public MyAL() {
        new MyAL(DEFAULT_CAPACITY);
    }

    @Override
    public boolean add(T o) {
        return false;
    }

    @Override
    public boolean add(int index, T o) {
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
        return null;
    }

    @Override
    public int indexOf(T o) {
        return 0;
    }

    @Override
    public boolean isEmpty(T o) {
        return false;
    }

    @Override
    public int lastIndexOf(T o) {
        return 0;
    }

    @Override
    public boolean remove(int index) {
        return false;
    }

    @Override
    public boolean remove(T o) {
        return false;
    }

    @Override
    public boolean set(int index, T o) {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public Iterator<T> iterator() {
        return new MyArrayListIterator();
    }

    private class MyArrayListIterator implements Iterator<T> {


        @Override
        public boolean hasNext() {
            return false;
        }

        @Override
        public T next() {
            return null;
        }
    }
}
