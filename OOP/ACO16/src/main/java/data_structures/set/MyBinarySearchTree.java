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

        if(comparator != null) return getNodeWithComparator(o) != null;
        else return getNodeWithComparable(o) != null;
    }

    private Node<E> getNodeWithComparable(Object o) {
        @SuppressWarnings(value = "unchecked")
        Comparable<? super E> comparable = (Comparable<? super E>) o;


        Node<E> iterator = root;

        while (iterator != null) {
            if(comparable.compareTo(iterator.value) > 0){
                iterator = iterator.rightChild;
            } else if(comparable.compareTo(iterator.value) < 0){
                iterator = iterator.leftChild;
            } else {
                return iterator;
            }
        }

        return null;
    }

    private Node<E> getNodeWithComparator(Object o) {
        @SuppressWarnings(value = "unchecked")
        E forCompare = (E) o;

        Node<E> iterator = root;

        while (iterator != null) {
            if(comparator.compare(forCompare, iterator.value) > 0){
                iterator = iterator.rightChild;
            } else if (comparator.compare(forCompare, iterator.value) < 0){
                iterator = iterator.leftChild;
            } else {
                return iterator;
            }
        }

        return null;
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

        if(o == null) throw new NullPointerException("o can't be null");

        Node<E> forRemove;

        if(comparator != null) {
            forRemove = getNodeWithComparator(o);
        } else {
            forRemove = getNodeWithComparable(o);
        }

        if(forRemove == null) return false;

        if(forRemove.rightChild == null && forRemove.leftChild == null) {
            deleteIfHasNotChildren(forRemove);
        } else if(forRemove.rightChild == null){
            deleteIfHasOnlyLeftChild(forRemove);
        } else if(forRemove.leftChild == null){
            deleteIfHasOnlyRightChild(forRemove);
        } else{
            deleteIfHasBothChildren(forRemove);
        }

        size--;
        return true;
    }

    private void deleteIfHasBothChildren(Node<E> forRemove) {
        Node<E> successor = findSuccessor(forRemove);
        if(forRemove == root){
            root = successor;
            root.parent = null;
            root.leftChild = forRemove.leftChild;
            Node<E> successorRightChild = successor.rightChild;
            Node<E> successorParent = successor.parent;
            root.rightChild = forRemove.rightChild;
            successorParent.leftChild = successorRightChild;
            successorRightChild.parent = root.rightChild;
        } else if (isRightChild(forRemove)){

        } else if (!isRightChild(forRemove)) {

        } else {

        }

    }

    private boolean isRightChild(Node<E> forRemove) {
        return forRemove == forRemove.parent.rightChild;
    }

    private Node<E> findSuccessor(Node<E> forRemove) {

        return getFirstNode(forRemove.rightChild);
    }

    private void deleteIfHasOnlyRightChild(Node<E> forRemove) {
        if(forRemove == root){
            root = forRemove.rightChild;
            forRemove.rightChild.parent = null;
        }else if(forRemove == forRemove.parent.leftChild){
            forRemove.rightChild.parent = forRemove.parent;
            forRemove.parent.leftChild = forRemove.rightChild;
        }else {
            forRemove.rightChild.parent = forRemove.parent;
            forRemove.parent.rightChild = forRemove.rightChild;
        }
    }

    private void deleteIfHasOnlyLeftChild(Node<E> forRemove) {
        if(forRemove == root){
            root = forRemove.leftChild;
            forRemove.leftChild.parent = null;
        } else if(forRemove == forRemove.parent.leftChild){
            forRemove.leftChild.parent = forRemove.parent;
            forRemove.parent.leftChild = forRemove.leftChild;
        } else {
            forRemove.leftChild.parent = forRemove.parent;
            forRemove.parent.rightChild = forRemove.leftChild;
        }
    }

    private void deleteIfHasNotChildren(Node<E> forRemove) {
        if (forRemove == root) {
            root = null;
        } else if (forRemove == forRemove.parent.leftChild) {
            forRemove.parent.leftChild = null;
        } else {
            forRemove.parent.rightChild = null;
        }
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
        return getFirstNode(root).value;
    }

    private Node<E> getFirstNode( Node<E> root){
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
            iterator = new Node<>(getFirstNode(root));
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
