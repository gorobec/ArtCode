package data_structures;

/**
 * Created by gorobec on 27.05.17.
 */
public class MyLinkedList implements MyList{

    private MyNode head;

    private MyNode tail;

    private int size;


    public MyLinkedList() {
    }

    @Override
    public boolean add(Object o) {

        MyNode node = new MyNode(o);

        if(size == 0) {
            head = tail = node;
        } else {
            tail.setNext(node);
            node.setPrevious(tail);
            tail = node;
        }
        size++;
        return true;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean add(Object o, int index) {
        return false;
    }

    @Override
    public Object get(int index) {
        return null;
    }

    @Override
    public Object remove(int index) {
        return null;
    }

    @Override
    public boolean set(Object o, int index) {
        return false;
    }
}
