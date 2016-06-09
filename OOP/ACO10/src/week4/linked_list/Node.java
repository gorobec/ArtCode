package week4.linked_list;


public class Node <T>{
    private Node <T>next;
    private T value;

    public Node() {
    }

    public Node(T value) {
        this.value = value;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    public T getValue() {
        return value;
    }

}
