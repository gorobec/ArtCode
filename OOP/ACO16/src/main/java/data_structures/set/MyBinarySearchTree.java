package data_structures.set;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Created by gorobec on 13.11.16.
 */
public class MyBinarySearchTree<E> implements NavigableSet<E>{

    private Node<E> root;
    private int size;
    private Comparator<? super E> comparator;

    public MyBinarySearchTree() {
    }

    public MyBinarySearchTree(Comparator<? super E> comparator) {
        this.comparator = comparator;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(Object o) {
        if(o == null) throw new NullPointerException("o == null");

        if(comparator != null) return findWithComparator(o);
        else return findWithComparable(o);
    }

    private boolean findWithComparable(Object o) {
        @SuppressWarnings(value = "unchecked")
        Comparable<? super E> comparable = (Comparable<? super E>) o;


        Node<E> iterator = root;

        while (iterator != null) {
            if(comparable.compareTo(iterator.value) > 0){
                iterator = iterator.rightChild;
            } else if(comparable.compareTo(iterator.value) < 0){
                iterator = iterator.leftChild;
            } else {
                return true;
            }
        }

        return false;
    }

    private boolean findWithComparator(Object o) {
        @SuppressWarnings(value = "unchecked")
        E forCompare = (E) o;

        Node<E> iterator = root;

        while (iterator != null) {
            if(comparator.compare(forCompare, iterator.value) > 0){
                iterator = iterator.rightChild;
            } else if (comparator.compare(forCompare, iterator.value) < 0){
                iterator = iterator.leftChild;
            } else {
                return true;
            }
        }

        return false;
    }

    @Override
    public boolean add(E  o) {
        if(root == null){
            root = new Node<>(o);
            size++;
            return true;
        }
        boolean result;

        if(comparator != null)
            result = addWithComparator(o);
        else
            result = addWithComparable(o);

        if(result) size++;

        return result;
    }

    private boolean addWithComparable(E o) {
        if(o == null) throw new NullPointerException("o == null");
        @SuppressWarnings(value = "unchecked")
        Comparable<? super E> comparable = (Comparable<? super E>) o;


        Node<E> iterator = root;
        Node<E> parent;

        do {
            parent = iterator;
            if(comparable.compareTo(iterator.value) > 0){
                iterator = iterator.rightChild;
            } else if(comparable.compareTo(iterator.value) < 0){
                iterator = iterator.leftChild;
            } else {
                return false;
            }
        } while (iterator != null);

        if(comparable.compareTo(parent.value) > 0){
            parent.rightChild = new Node<>(parent, o);
        } else {
            parent.leftChild = new Node<>(parent, o);

        }

        return true;

    }

    private boolean addWithComparator(E o) {
        if(o == null) throw new NullPointerException("o == null");

        Node<E> iterator = root;
        Node<E> parent;

        do {
            parent = iterator;
            if(comparator.compare(o, iterator.value) > 0){
                iterator = iterator.rightChild;
            } else if(comparator.compare(o, iterator.value) < 0){
                iterator = iterator.leftChild;
            } else {
                return false;
            }
        } while (iterator != null);

        if(comparator.compare(o, parent.value) > 0){
            parent.rightChild = new Node<>(parent, o);
        } else {
            parent.leftChild = new Node<>(parent, o);

        }

        return true;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public E[] toArray(Object[] a) {
        return (E[])new Object[0];
    }

    @Override
    public E lower(E e) {
        return null;
    }

    @Override
    public E floor(E e) {
        return null;
    }

    @Override
    public E ceiling(E e) {
        return null;
    }

    @Override
    public E higher(E e) {
        return null;
    }

    @Override
    public E pollFirst() {
        return null;
    }

    @Override
    public E pollLast() {
        return null;
    }

    @Override
    public Comparator<E> comparator() {
        return null;
    }

    @Override
    public E first() {
        return getFirstNode().value;
    }

    private Node<E> getFirstNode(){
        if(isEmpty()) throw new NoSuchElementException("BST is empty");

        Node<E> iterator = root;

        while (iterator.leftChild != null){
            iterator = iterator.leftChild;
        }
        return iterator;
    }

    /**
     *
     * Returns the last (highest) element currently in this set.
     *
     * @return the first (lowest) element currently in this set
     *
     * @throws NoSuchElementException - if this set is empty
     *
     * */
    @Override
    public E last() {
        if(isEmpty()) throw new NoSuchElementException("BST is empty");

        Node<E> iterator = root;

        while (iterator.rightChild != null){
            iterator = iterator.rightChild;
        }
        return iterator.value;
    }

    @Override
    public Iterator<E> iterator() {
        return new MyBstIterator();
    }




    private static class Node<E> {
        private Node<E> parent;
        private Node<E> leftChild;
        private Node<E> rightChild;
        private E value;

        public Node(E value) {
            this.value = value;
        }
        public Node(Node<E> parent, E value) {
            this.parent = parent;
            this.value = value;
        }

        public Node(Node<E> parent) {
            this.parent = parent;
        }
    }

    private class MyBstIterator implements Iterator<E> {


        Node<E> iterator;

        MyBstIterator() {
            iterator = new Node<>(getFirstNode());
        }

        @Override
        public boolean hasNext() {
            return iterator.parent != null || iterator.rightChild != null;
        }

        @Override
        public E next() {
            return null;
        }
    }
}
